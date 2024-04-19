package com.example.countermvvm;

data public class CounterModel(var count: Int)

// 데이터는 여기 안에 모두 관리
class CounterRepository{
    private var _counter = CounterModel(0)

    fun getCounter() = _counter

    fun incrementCounter(){
        _counter.count++
    }

    fun decrementCounter(){
        _counter.count--
    }
}