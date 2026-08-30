//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/nullalble_match_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_group_delivery_estimates_keywords_items.g.dart';

/// AdGroupDeliveryEstimatesKeywordsItems
///
/// Properties:
/// * [matchType] 
/// * [value] - Keyword value (120 chars max).
@BuiltValue()
abstract class AdGroupDeliveryEstimatesKeywordsItems implements Built<AdGroupDeliveryEstimatesKeywordsItems, AdGroupDeliveryEstimatesKeywordsItemsBuilder> {
  @BuiltValueField(wireName: r'match_type')
  NullalbleMatchType? get matchType;
  // enum matchTypeEnum {  BROAD,  PHRASE,  EXACT,  EXACT_NEGATIVE,  PHRASE_NEGATIVE,  ,  };

  /// Keyword value (120 chars max).
  @BuiltValueField(wireName: r'value')
  String get value;

  AdGroupDeliveryEstimatesKeywordsItems._();

  factory AdGroupDeliveryEstimatesKeywordsItems([void updates(AdGroupDeliveryEstimatesKeywordsItemsBuilder b)]) = _$AdGroupDeliveryEstimatesKeywordsItems;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdGroupDeliveryEstimatesKeywordsItemsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdGroupDeliveryEstimatesKeywordsItems> get serializer => _$AdGroupDeliveryEstimatesKeywordsItemsSerializer();
}

class _$AdGroupDeliveryEstimatesKeywordsItemsSerializer implements PrimitiveSerializer<AdGroupDeliveryEstimatesKeywordsItems> {
  @override
  final Iterable<Type> types = const [AdGroupDeliveryEstimatesKeywordsItems, _$AdGroupDeliveryEstimatesKeywordsItems];

  @override
  final String wireName = r'AdGroupDeliveryEstimatesKeywordsItems';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdGroupDeliveryEstimatesKeywordsItems object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'match_type';
    yield object.matchType == null ? null : serializers.serialize(
      object.matchType,
      specifiedType: const FullType.nullable(NullalbleMatchType),
    );
    yield r'value';
    yield serializers.serialize(
      object.value,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    AdGroupDeliveryEstimatesKeywordsItems object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdGroupDeliveryEstimatesKeywordsItemsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'match_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(NullalbleMatchType),
          ) as NullalbleMatchType?;
          if (valueDes == null) continue;
          result.matchType = valueDes;
          break;
        case r'value':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.value = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AdGroupDeliveryEstimatesKeywordsItems deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdGroupDeliveryEstimatesKeywordsItemsBuilder();
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

