'use strict';

function isRotation(s1, s2) {
    if (s1.length === s2.length) {
        var newString = s1 + s1;
        return newString.includes(s2);
    }
    return false;
}
