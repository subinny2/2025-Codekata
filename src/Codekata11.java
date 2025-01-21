/*
* 코드 처리하기
* 문자열 code가 주어집니다.
* code를 앞에서부터 읽으면서 만약 문자가 "1"이면 mode를 바꿉니다. mode에 따라 code를 읽어가면서 문자열 ret을 만들어냅니다.
* mode는 0과 1이 있으며, idx를 0 부터 code의 길이 - 1 까지 1씩 키워나가면서 code[idx]의 값에 따라 다음과 같이 행동합니다.
* */
public class Codekata11 {
    static class Solution11 {
        public String solution11(String code) {
            String answer = "";
            int mode = 0;
            for(int i=0; i<code.length(); i++){
                if(mode==0){
                    if(code.charAt(i) != '1' && i%2==0) { // code[idx]가 1이 아니고, i가 짝수일때
                        answer += code.charAt(i);
                    }else if(code.charAt(i) == '1'){
                            mode = 1;
                        }
                    }
                else if(mode==1){
                    if(code.charAt(i) != '1' && i%2==1) {
                        answer += code.charAt(i);
                    }else if(code.charAt(i)=='1'){
                            mode=0;
                        }
                    }
                }
            if(answer.isEmpty()){
                return "EMPTY";
            }
            return answer;
        }
        }

        public static void main(String[] args){
            Codekata11.Solution11 sol11 = new Codekata11.Solution11();
            String result = sol11.solution11("abc1abc1abc");
            System.out.println(result);
        }
    }

