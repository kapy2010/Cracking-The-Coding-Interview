'use strict';

function removeDuplicates(str) {
    if (str === null) return;
    if (str.length === 2) return str;

    var in_index = 1;
    var res_index = 1;

    str.sort();

    while (in_index < str.length) {
        if (str[in_index] !== str[in_index - 1]) {
            str[res_index] = str[in_index];
            res_index++;
        }
        in_index++;
    }

    return str.slice(0, res_index);
}

function removeDuplicates2(str) {
    if (str === null) return;
    if (str.length === 2) return str;

    var in_index = 0;
    var res_index = 0;

    var char_set = new Array(256);
    for (var i = 0; i < 256; i++) char_set.push(false);

    while (in_index < str.length) {
        var val = str[in_index];
        if (!char_set[val]) {
            str[res_index] = str[in_index];
            char_set[val] = true;
            res_index++;
        }
        in_index++;
    }

    return str.slice(0, res_index);
}
