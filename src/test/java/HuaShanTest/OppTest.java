package HuaShanTest;


import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;

import java.math.BigDecimal;
import java.util.Objects;

@Slf4j
public class OppTest {

    @Test
    public void equalsUtilTest() {
        String test1 = "今天太阳真大.";
        String test2 = "外面真冷";
        String test3;

        if (Objects.equals(test1, test2)) {
            log.info("test data 相等");
        } else {
            log.info("test data 不相等");
        }
        test3 = test1;
        if (Objects.equals(test1, test3)) {
            log.info("test1 等与 test3");
        } else {
            log.info("test 不等与 test3");
        }
    }

    @Test
    public void floatTest() {
        float float1 = 1.0001f;
        float float2 = 1.0001f;


        if (float1 == float2) {
            log.info("相等的浮点数");
        }


        float res1 = 1.0f -0.9f;
        float res2 = 2.0f -1.9f;
        if (res1 == res2) {
            log.info("相等的计算结果");
        }
        else {
            log.info("不相等的计算结果");
        }

        float a = 1.0f - 0.9f;
        float b = 0.9f - 0.8f;
        if (a == b) {

        }
    }

    @Test
    public void bigDecimalTest() {
        BigDecimal bigDecimal1 = BigDecimal.valueOf(1.5555555);
        BigDecimal bigDecimal2 = BigDecimal.valueOf(1.6555555);
        BigDecimal bigDecimal11 = BigDecimal.valueOf(2.3);
        BigDecimal bigDecimal12 = BigDecimal.valueOf(2.4);

        BigDecimal result1 = bigDecimal2.subtract(bigDecimal1);
        BigDecimal result2 = bigDecimal12.subtract(bigDecimal11);

        log.info("result1 is :{}", result1);
        log.info("result2 is :{}", result2);
        if (result1.equals(result2)) {
            log.info("相等的结果");
        }
        else {
            log.info("不相等的结果");
        }
    }
}
