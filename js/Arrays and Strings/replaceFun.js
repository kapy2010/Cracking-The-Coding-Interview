'use strict';

function replaceFun(str) {
    var newLength = 0, spaceCount = 0, length = str.length;
    for (var i = 0; i < length; i++)
        if (str[i] == ' ')
            spaceCount++;

    newLength = length + spaceCount * 2;

    for (var i = length - 1; i >= 0; i--) {
        if (str[i] == ' ') {
            str[newLength - 1] = '0';
            str[newLength - 2] = '2';
            str[newLength - 3] = '%';
            newLength -= 3;
        } else {
            str[newLength - 1] = str[i];
            newLength -= 1;
        }
    }

}
