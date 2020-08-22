package ModularProgramming.utils;

import ModularProgramming.utils.internals.DivHelper;
import ModularProgramming.utils.internals.MultHelper;
import ModularProgramming.utils.internals.SubtHelper;
import ModularProgramming.utils.internals.SumHelper;

public class Calculadora {
    private SumHelper sumHelper;
    private SubtHelper subtHelper;
    private MultHelper multHelper;
    private DivHelper divHelper;

    public Calculadora (){
        sumHelper = new SumHelper();
        subtHelper = new SubtHelper();
        multHelper = new MultHelper();
        divHelper = new DivHelper();
    }

    public int sum(int a, int b){ return sumHelper.execute(a,b); }
    public int subt(int a, int b){ return subtHelper.execute(a,b); }
    public int mult(int a, int b){ return multHelper.execute(a,b); }
    public int div(int a, int b){ return divHelper.execute(a,b); }
}
