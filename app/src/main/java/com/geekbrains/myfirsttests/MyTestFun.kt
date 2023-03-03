package com.geekbrains.myfirsttests

class MyTestFun {

    companion object{

        fun isSameData(dataFirst:Data, dataTwo:Data):Boolean{
            return dataFirst.equals(dataTwo)
        }

        fun notNullData(listDataIn:List<Data>):Boolean{
            return listDataIn.isEmpty()
        }

        fun isEqualsValue(valueOne:String, valueTwo:String):Boolean{
            return valueOne==valueTwo
        }

        fun <T,I> isEqualsObject(intObj1:T, intObj2:I):Boolean{
            return intObj1.hashCode()==intObj2.hashCode()
        }

    }
}