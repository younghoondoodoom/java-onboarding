## 🚀 Problem67요구 사항 분석
### 문제 분석
점수를 통해 친구 추천 알고리즘을 구현하는 문제이다. 점수 기준은 다음과 같다.
어떤 사용자의 점수 = 사용자와 함께 아는 친구의 수 * 10 + 사용자의 타임 라인에 방문한 횟수
점수가 높은 순대로 최대 5명을 뽑아 반환한다. 만약 5명이 되지않는다면 그대로 반환한다.
만약 0점인 사용자가 있다면 결과에서 제외해야한다. 

### 기능 분석
1. 예외 사항 처리
    - 제한 사항만 있으므로 초기에 따로 처리해줘야할 것은 없다. 결과를 반환하기 전에 0점인 사람을 제외 시키는 예외 사항만 처리하면 된다.
2. 점수 처리
   - 효율적인 점수 처리를 위해서 Map으로 스코어 보드를 만든다.
   - 사용자와 함께 아는 친구 점수 처리
     - 친구 관계를 Map으로 만든다.
     - 사용자의 친구와 친구인 경우 스코어 보드에 추가하고 +10을 해준다.
   - 방문자 점수 처리
     - 방문한 적이 있다면 스코어 보드에 추가하고 +1을 해준다.
3. 결과 반환
   - 0점인 사람은 애초에 스코어 보드에 올라가지 못하므로 신경 쓰지 않아도 된다.
   - 스코어 순으로 정렬해서 반환한다.
   - 만약 5명이 넘는다면 5명으로 잘라서 반환한다.