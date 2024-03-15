@isTest
private class OASQuizPinResultTest {
    @isTest
    private static void equalsSameInstance() {
        OASQuizPinResult quizPinResult1 = OASQuizPinResult.getExample();
        OASQuizPinResult quizPinResult2 = quizPinResult1;
        OASQuizPinResult quizPinResult3 = new OASQuizPinResult();
        OASQuizPinResult quizPinResult4 = quizPinResult3;

        System.assert(quizPinResult1.equals(quizPinResult2));
        System.assert(quizPinResult2.equals(quizPinResult1));
        System.assert(quizPinResult1.equals(quizPinResult1));
        System.assert(quizPinResult3.equals(quizPinResult4));
        System.assert(quizPinResult4.equals(quizPinResult3));
        System.assert(quizPinResult3.equals(quizPinResult3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASQuizPinResult quizPinResult1 = OASQuizPinResult.getExample();
        OASQuizPinResult quizPinResult2 = OASQuizPinResult.getExample();
        OASQuizPinResult quizPinResult3 = new OASQuizPinResult();
        OASQuizPinResult quizPinResult4 = new OASQuizPinResult();

        System.assert(quizPinResult1.equals(quizPinResult2));
        System.assert(quizPinResult2.equals(quizPinResult1));
        System.assert(quizPinResult3.equals(quizPinResult4));
        System.assert(quizPinResult4.equals(quizPinResult3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASQuizPinResult quizPinResult1 = OASQuizPinResult.getExample();
        OASQuizPinResult quizPinResult2 = new OASQuizPinResult();

        System.assertEquals(false, quizPinResult1.equals('foo'));
        System.assertEquals(false, quizPinResult2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASQuizPinResult quizPinResult1 = OASQuizPinResult.getExample();
        OASQuizPinResult quizPinResult2 = new OASQuizPinResult();
        OASQuizPinResult quizPinResult3;

        System.assertEquals(false, quizPinResult1.equals(quizPinResult3));
        System.assertEquals(false, quizPinResult2.equals(quizPinResult3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASQuizPinResult quizPinResult1 = OASQuizPinResult.getExample();
        OASQuizPinResult quizPinResult2 = new OASQuizPinResult();

        System.assertEquals(quizPinResult1.hashCode(), quizPinResult1.hashCode());
        System.assertEquals(quizPinResult2.hashCode(), quizPinResult2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASQuizPinResult quizPinResult1 = OASQuizPinResult.getExample();
        OASQuizPinResult quizPinResult2 = OASQuizPinResult.getExample();
        OASQuizPinResult quizPinResult3 = new OASQuizPinResult();
        OASQuizPinResult quizPinResult4 = new OASQuizPinResult();

        System.assert(quizPinResult1.equals(quizPinResult2));
        System.assert(quizPinResult3.equals(quizPinResult4));
        System.assertEquals(quizPinResult1.hashCode(), quizPinResult2.hashCode());
        System.assertEquals(quizPinResult3.hashCode(), quizPinResult4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASQuizPinResult quizPinResult = new OASQuizPinResult();
        Map<String, String> x-property-mappings = quizPinResult.getx-property-mappings();
        System.assertEquals('organicPinId', x-property-mappings.get('organic_pin_id'));
        System.assertEquals('androidDeepLink', x-property-mappings.get('android_deep_link'));
        System.assertEquals('iosDeepLink', x-property-mappings.get('ios_deep_link'));
        System.assertEquals('destinationUrl', x-property-mappings.get('destination_url'));
        System.assertEquals('resultId', x-property-mappings.get('result_id'));
    }
}
