'use strict';

function setZeros(matrix) {
    var row = [];
    var column = [];
    for (var i = 0; i < matrix.length; i++) {
        for (var j = 0; j < matrix[0].length; j++) {
            if (matrix[i][j] == 0) {
                row[i] = 1;
                column[j] = 1;
            }
        }
    }

    for (var i = 0; i < matrix.length; i++) {
        for (var j = 0; j < matrix[0].length; j++) {
            if (row[i] == 1 || column[j] == 1)
                matrix[i][j] = 0;
        }
    }
}
