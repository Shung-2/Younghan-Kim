package static1;

public class MathArrayUtils {

    private MathArrayUtils()
    {
        // 인스턴스 생성을 막는다.
    }

    public static int sum(int[] values)
    {
        int sum = 0;
        for (int i = 0; i < values.length; i++)
        {
            sum += values[i];
        }

        return sum;
    }

    public static double average(int[] values)
    {
        return (double) sum(values) / values.length;
    }

    public static int min(int[] values)
    {
        int minValue = values[0];
        for (int value : values)
        {
            if (value < minValue)
            {
                minValue = value;
            }
        }

        return minValue;
    }

    public static int max(int[] values)
    {
        int maxValue = values[0];
        for (int value : values)
        {
            if (value > maxValue)
            {
                maxValue = value;
            }
        }

        return maxValue;
    }
}
