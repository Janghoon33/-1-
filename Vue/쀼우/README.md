# ⭐ Vue 
`by Janghoon`
<br>

## Category 
- [🐛 데이터바인딩](#-데이터바인딩)
- [🐛 v-for](#-v-for)
- [🐛 이벤트핸들러](#-이벤트핸들러)

<br>

## 🐛 데이터바인딩
* HTML에 데이터를 바인딩할때 {{ 자료이름 }} 표기 <br>
```javascript
 data(){ return{ 
     object 자료형 데이터 저장 (자료이름 : 자료내용) 
  }}

ex) <p>{{ price1 }} 만원</p>
data(){ 
    return {
      price1 : 80
    }
  }
```
  <br>

* HTML 속성도 바인딩 가능 <br>
```javascript
:속성 = "데이터 이름"

ex) <h3 :style="스타일">example</h3>
data(){ 
    return {
      스타일 : 'color : blue'
    }
  }
```
데이터바인딩 하는 이유 
1. HTML에 하드코딩해놓으면 추후 변경에 어려움이 있음
2. Vue 실시간 자동 렌더링 활용 가능
   
<br>

## 🐛 v-for 
1. v-for를 통해서 HTML 반복문 적용 가능 <br>
```javascript
<태그 v-for="변수 in 반복횟수" :key="변수">

ex) <a v-for="b in menus" :key="b">{{ b }}</a>
```
- 반복횟수에 데이터(array,object)를 넣어 데이터의 갯수만큼 반복 가능 <br>
- 변수은 데이터 안의 자료가 됨 <br>
- key의 용도 : 반복문 돌린 요소를 컴퓨터가 구분하기 위해  사용 <br> <br>

2. 변수 작명 2개까지 가능
```javascript
<태그 v-for="(변수,i)  in 반복횟수" :key="변수">

ex) <a v-for="(변수,b) in menus" :key="b">{{ b }}</a>
```
- "변수"는 array내의 데이터 , "i"는 1씩 증가하는 정수

<br>

## 🐛 이벤트핸들러
1. 클릭시 자바스크립트가 실행 
```javascript
<button v-on:click="버튼클릭수++">버튼 {{ 버튼클릭수 }}</button>

v-on 을 @로 대체 가능
<button @:click="">버튼</button>

data(){ 
    return {
      버튼클릭수 : 0
    }
  }
```

- click뿐 아니라 다른 여러가지 이벤트도 사용가능
<br>
<br>

2. Vue에서 함수만드는법
```javascript
<button v-on:click="clickFunction">버튼 {{ 버튼클릭수 }}</button>
data(){ 
    return {
      버튼클릭수 : 0
    }
  },
methods: {
 clickFunction(){
  this.버튼클릭수++;
 }
}
```
- methods에 함수 선언가능 
- 함수안에서 데이터를 사용할땐 this를 사용해야함
- 따옴표안의 로직 대신 함수 기입
- Vue에서는 함수호출시 () 안붙임

<br>

**[⬆ back to top](#Category-Category)**
