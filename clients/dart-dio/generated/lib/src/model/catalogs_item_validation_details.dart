//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/nullable_catalogs_item_field_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_item_validation_details.g.dart';

/// CatalogsItemValidationDetails
///
/// Properties:
/// * [attributeName] - Attribute that has a validation issue.
/// * [providedValue] - Provided value that caused the validation issue.
@BuiltValue()
abstract class CatalogsItemValidationDetails implements Built<CatalogsItemValidationDetails, CatalogsItemValidationDetailsBuilder> {
  /// Attribute that has a validation issue.
  @BuiltValueField(wireName: r'attribute_name')
  NullableCatalogsItemFieldType? get attributeName;
  // enum attributeNameEnum {  ITEM_ID,  ITEM_GROUP_ID,  TITLE,  DESCRIPTION,  ITEM_LINK,  ORGANIC_LINK,  IMAGE_LINK,  ADWORDS_REDIRECT_LINK,  AD_LINK,  SIZE,  GOOGLE_PRODUCT_CATEGORY,  PRODUCT_CATEGORY,  CONDITION,  AVAILABILITY,  GENDER,  AGE_GROUP,  SIZE_TYPE,  SIZE_SYSTEM,  ADULT,  SHIPPING,  SHIPPING_WEIGHT,  TAX,  MULTIPACK,  ADDITIONAL_IMAGE_LINK,  PRICE,  SALE_PRICE,  IS_BUNDLE,  EXPIRATION_DATE,  AVAILABILITY_DATE,  WEIGHT_UNIT,  PRODUCT_TYPE,  CUSTOM_LABEL_0,  CUSTOM_LABEL_1,  CUSTOM_LABEL_2,  CUSTOM_LABEL_3,  CUSTOM_LABEL_4,  MATERIAL,  PATTERN,  COLOR,  BRAND,  GTIN,  MPN,  IOS_DEEP_LINK,  ANDROID_DEEP_LINK,  FREE_SHIPPING_LABEL,  FREE_SHIPPING_LIMIT,  AVG_REVIEW_RATING,  NUM_RATINGS,  NUM_REVIEWS,  ALT_TEXT,  VARIANT_NAMES,  VARIANT_VALUES,  MIN_AD_PRICE,  SHIPPING_WIDTH,  SHIPPING_HEIGHT,  AD_IMAGE_0_LINK,  AD_IMAGE_1_LINK,  AD_IMAGE_2_LINK,  AD_IMAGE_3_LINK,  AD_IMAGE_4_LINK,  AD_IMAGE_5_LINK,  AD_IMAGE_6_LINK,  AD_IMAGE_7_LINK,  AD_IMAGE_8_LINK,  AD_IMAGE_9_LINK,  AD_IMAGE_10_LINK,  AD_IMAGE_11_LINK,  AD_IMAGE_12_LINK,  AD_IMAGE_13_LINK,  AD_IMAGE_14_LINK,  AD_IMAGE_15_LINK,  AD_IMAGE_16_LINK,  AD_IMAGE_17_LINK,  AD_IMAGE_18_LINK,  AD_IMAGE_19_LINK,  AD_IMAGE_0_TAG,  AD_IMAGE_1_TAG,  AD_IMAGE_2_TAG,  AD_IMAGE_3_TAG,  AD_IMAGE_4_TAG,  AD_IMAGE_5_TAG,  AD_IMAGE_6_TAG,  AD_IMAGE_7_TAG,  AD_IMAGE_8_TAG,  AD_IMAGE_9_TAG,  AD_IMAGE_10_TAG,  AD_IMAGE_11_TAG,  AD_IMAGE_12_TAG,  AD_IMAGE_13_TAG,  AD_IMAGE_14_TAG,  AD_IMAGE_15_TAG,  AD_IMAGE_16_TAG,  AD_IMAGE_17_TAG,  AD_IMAGE_18_TAG,  AD_IMAGE_19_TAG,  AD_VIDEO_0_LINK,  AD_VIDEO_1_LINK,  AD_VIDEO_2_LINK,  AD_VIDEO_0_TAG,  AD_VIDEO_1_TAG,  AD_VIDEO_2_TAG,  INSTALLMENT_PRICE,  UNIT_PRICE_TOTAL_MEASURE,  UNIT_PRICE_BASE_MEASURE,  SALE_PRICE_EFFECTIVE_DATE,  ,  };

  /// Provided value that caused the validation issue.
  @BuiltValueField(wireName: r'provided_value')
  String? get providedValue;

  CatalogsItemValidationDetails._();

  factory CatalogsItemValidationDetails([void updates(CatalogsItemValidationDetailsBuilder b)]) = _$CatalogsItemValidationDetails;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsItemValidationDetailsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsItemValidationDetails> get serializer => _$CatalogsItemValidationDetailsSerializer();
}

class _$CatalogsItemValidationDetailsSerializer implements PrimitiveSerializer<CatalogsItemValidationDetails> {
  @override
  final Iterable<Type> types = const [CatalogsItemValidationDetails, _$CatalogsItemValidationDetails];

  @override
  final String wireName = r'CatalogsItemValidationDetails';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsItemValidationDetails object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'attribute_name';
    yield object.attributeName == null ? null : serializers.serialize(
      object.attributeName,
      specifiedType: const FullType.nullable(NullableCatalogsItemFieldType),
    );
    yield r'provided_value';
    yield object.providedValue == null ? null : serializers.serialize(
      object.providedValue,
      specifiedType: const FullType.nullable(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsItemValidationDetails object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsItemValidationDetailsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'attribute_name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(NullableCatalogsItemFieldType),
          ) as NullableCatalogsItemFieldType?;
          if (valueDes == null) continue;
          result.attributeName = valueDes;
          break;
        case r'provided_value':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.providedValue = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsItemValidationDetails deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsItemValidationDetailsBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

