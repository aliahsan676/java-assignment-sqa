package assignment6.Generic;

//Created Generic class

public class Generic <T> {

        // variable of T type
        private T dataType;

        public Generic(T dataType) {
            this.dataType = dataType;

        }

        //method that return T type variable
        public T getDataType() {
            return dataType;
        }

}
