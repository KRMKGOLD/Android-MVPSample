# Study MVP-Pattern

- 안드로이드 아키텍쳐 패턴 중 MVP 패턴에 대해서 자세히 이해 및 구현을 위한 레포지트리.

스스로 정리한 아키텍쳐 패턴 - [Android-Architecture](https://github.com/KRMKGOLD/Android-Architecture)

**다시 생각해 보는 MVP!**

1. MVP 패턴?

   ![](https://t1.daumcdn.net/cfile/tistory/273A7E4A5844B8B939)

   - Model, View, Presenter로 구성된 안드로이드 아키텍쳐 패턴.

   - 장점 : M-V간의 의존성이 적어 테스트 코드 작성이 쉽고, 확장성이 좋아진다.

     단점 : M-V간의 의존성이 낮아진 대신 View-Presenter 의존성이 강함(View : Presenter = 1 : 1) , 클래스의 개수가 많아진다.

2. 현재의 MVP보다 발전된 다른 아키텍쳐 패턴은?

   - MVVM이 존재 (Model, View, ViewModel). MVP의 1 : 1 대응 문제를 해결 (ViewModel과 View의 대응 관계는 1 : n)
   - 그러나 ViewModel의 구현이 어렵다는 단점이 존재

   - 현 많은 곳에서 MVP 패턴을 이용하여 **협업**을 하고 있음

3. MVP 구현 방식은?

   - 여러가지 스타일이 존재한다

   1. View Interface 구현 - [구현 코드](https://github.com/KRMKGOLD/studyMVP/tree/View-interface)
      - interface View : 오직 View에 대한 interface만 작성
      - Presenter : interface X, 함수 사용해 구현
      - View : interface View를 상속받아서 정의한다.
   2. Google Architecture - [구현 코드](https://github.com/KRMKGOLD/studyMVP/tree/Google_Architecture)
      - Contract : View와 Presenter에 대한 Interface를 작성
      - Presenter : Contract.Presenter를 상속받은 후 작성
      - View : Contract.View를 상속받은 후 작성
   3. PresenterImpl를 구현 - [구현 코드](https://github.com/KRMKGOLD/studyMVP/tree/PresenterImpl)

      - Presenter : Presenter와 View에 대한 interface을 구현
      - PresenterImpl : Presenter을 상속받은 후 구현
      - View : Presenter.View을 상속받은 후 구현


참고 : [태환님 블로그 MVP 설명](https://thdev.tech/androiddev/2016/11/28/Android-MVP-One/)
