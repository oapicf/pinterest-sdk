@isTest
private class OASPinMediaSourcePinURLTest {
    @isTest
    private static void equalsSameInstance() {
        OASPinMediaSourcePinURL pinMediaSourcePinURL1 = OASPinMediaSourcePinURL.getExample();
        OASPinMediaSourcePinURL pinMediaSourcePinURL2 = pinMediaSourcePinURL1;
        OASPinMediaSourcePinURL pinMediaSourcePinURL3 = new OASPinMediaSourcePinURL();
        OASPinMediaSourcePinURL pinMediaSourcePinURL4 = pinMediaSourcePinURL3;

        System.assert(pinMediaSourcePinURL1.equals(pinMediaSourcePinURL2));
        System.assert(pinMediaSourcePinURL2.equals(pinMediaSourcePinURL1));
        System.assert(pinMediaSourcePinURL1.equals(pinMediaSourcePinURL1));
        System.assert(pinMediaSourcePinURL3.equals(pinMediaSourcePinURL4));
        System.assert(pinMediaSourcePinURL4.equals(pinMediaSourcePinURL3));
        System.assert(pinMediaSourcePinURL3.equals(pinMediaSourcePinURL3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPinMediaSourcePinURL pinMediaSourcePinURL1 = OASPinMediaSourcePinURL.getExample();
        OASPinMediaSourcePinURL pinMediaSourcePinURL2 = OASPinMediaSourcePinURL.getExample();
        OASPinMediaSourcePinURL pinMediaSourcePinURL3 = new OASPinMediaSourcePinURL();
        OASPinMediaSourcePinURL pinMediaSourcePinURL4 = new OASPinMediaSourcePinURL();

        System.assert(pinMediaSourcePinURL1.equals(pinMediaSourcePinURL2));
        System.assert(pinMediaSourcePinURL2.equals(pinMediaSourcePinURL1));
        System.assert(pinMediaSourcePinURL3.equals(pinMediaSourcePinURL4));
        System.assert(pinMediaSourcePinURL4.equals(pinMediaSourcePinURL3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPinMediaSourcePinURL pinMediaSourcePinURL1 = OASPinMediaSourcePinURL.getExample();
        OASPinMediaSourcePinURL pinMediaSourcePinURL2 = new OASPinMediaSourcePinURL();

        System.assertEquals(false, pinMediaSourcePinURL1.equals('foo'));
        System.assertEquals(false, pinMediaSourcePinURL2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPinMediaSourcePinURL pinMediaSourcePinURL1 = OASPinMediaSourcePinURL.getExample();
        OASPinMediaSourcePinURL pinMediaSourcePinURL2 = new OASPinMediaSourcePinURL();
        OASPinMediaSourcePinURL pinMediaSourcePinURL3;

        System.assertEquals(false, pinMediaSourcePinURL1.equals(pinMediaSourcePinURL3));
        System.assertEquals(false, pinMediaSourcePinURL2.equals(pinMediaSourcePinURL3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPinMediaSourcePinURL pinMediaSourcePinURL1 = OASPinMediaSourcePinURL.getExample();
        OASPinMediaSourcePinURL pinMediaSourcePinURL2 = new OASPinMediaSourcePinURL();

        System.assertEquals(pinMediaSourcePinURL1.hashCode(), pinMediaSourcePinURL1.hashCode());
        System.assertEquals(pinMediaSourcePinURL2.hashCode(), pinMediaSourcePinURL2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPinMediaSourcePinURL pinMediaSourcePinURL1 = OASPinMediaSourcePinURL.getExample();
        OASPinMediaSourcePinURL pinMediaSourcePinURL2 = OASPinMediaSourcePinURL.getExample();
        OASPinMediaSourcePinURL pinMediaSourcePinURL3 = new OASPinMediaSourcePinURL();
        OASPinMediaSourcePinURL pinMediaSourcePinURL4 = new OASPinMediaSourcePinURL();

        System.assert(pinMediaSourcePinURL1.equals(pinMediaSourcePinURL2));
        System.assert(pinMediaSourcePinURL3.equals(pinMediaSourcePinURL4));
        System.assertEquals(pinMediaSourcePinURL1.hashCode(), pinMediaSourcePinURL2.hashCode());
        System.assertEquals(pinMediaSourcePinURL3.hashCode(), pinMediaSourcePinURL4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPinMediaSourcePinURL pinMediaSourcePinURL = new OASPinMediaSourcePinURL();
        Map<String, String> x-property-mappings = pinMediaSourcePinURL.getx-property-mappings();
        System.assertEquals('sourceType', x-property-mappings.get('source_type'));
        System.assertEquals('isAffiliateLink', x-property-mappings.get('is_affiliate_link'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPinMediaSourcePinURL pinMediaSourcePinURL = new OASPinMediaSourcePinURL();
        System.assertEquals(false, pinMediaSourcePinURL.isAffiliateLink);
        System.assertEquals(null, pinMediaSourcePinURL.sourceType);
    }
}
