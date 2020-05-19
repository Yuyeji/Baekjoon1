# baekjoon1

## Scanner와 Bufferedreader의 차이

- 스캐너의 경우 사용하기 편리하지만 속도가 느리다

- 버퍼리더는 한줄을 통째로 입력받는 방법으로 이것저것 선언해야할 것이 많아 번거롭지만 비교적 빠를 수 있다

- int a = br.read();   //입력받을 값이 int 일 경우
- String s = br.readLine();   //입력받을 값이 String일 경우
- int b = Integer.parseInt(br.readLine());      //int값+엔터 까지 입력받을 
        
