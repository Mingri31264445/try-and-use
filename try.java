class CRect{
    int height;
    int width;

    CRect(){
        height=3;
        width=5;
    }
}

public static void main(String[] args){
    CRect[] rect=new CRect[3];

    CRect[1].height=3;
    CRect[1].height=5;

    System.out.println(CRect[1].height);
}