'use strict';

function isUniqueChars(str) {
    var char_set = new Array(256);
    for (var j = 0; i < 256; i++)
        char_set.push(false);

    for (var i = 0; i < str.length; i++) {
        var val = str.charCodeAt(i);
        if (char_set[val]) return false;
        char_set[val] = true;
    }

    return true;
}

function isUniqueChars2(str) {
    var checker = 0;
    for (var i = 0; i < str.length; i++) {
        var val = str.charCodeAt(i) - 97;
        if ((checker & (1 << val)) > 0) return false;
        checker |= (1 << val);
    }
    return true;
}
