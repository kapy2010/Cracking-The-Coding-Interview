'use strict';

function anagram(str1, str2) {
    var char_set = new Array(256);
    for (var i = 0; i < 256; i++) char_set[i] = 0;

    var val;

    for (var i = 0; i < str1.length; i++) {
        val = str1.charCodeAt(i);
        char_set[val]++;
    }

    for (var i = 0; i < str2.length; i++) {
        val = str2.charCodeAt(i);
        if (char_set[val] > 0)
            char_set[val]--;
        else
            char_set[val]++;
    }

    var sum = 0;
    for (var i = 0; i < 256; i++) sum += char_set[i];

    if (sum === 0) return true;

    return false;

}
