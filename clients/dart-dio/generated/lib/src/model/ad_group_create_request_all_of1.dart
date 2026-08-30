//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/budget_type.dart';
import 'package:openapi/src/model/pacing_delivery_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_group_create_request_all_of1.g.dart';

/// AdGroupCreateRequestAllOf1
///
/// Properties:
/// * [autoTargetingEnabled] - Enable auto-targeting for ad group. Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/performance-plus-targeting\" target=\"_blank\">\"Pinterest Performance+ targeting\"</a>.
/// * [bidMultiplier] - <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the `bid_strategy` type for your ad group is set to `AUTOMATIC_BID`. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>.
/// * [budgetType] 
/// * [pacingDeliveryType] 
@BuiltValue()
abstract class AdGroupCreateRequestAllOf1 implements Built<AdGroupCreateRequestAllOf1, AdGroupCreateRequestAllOf1Builder> {
  /// Enable auto-targeting for ad group. Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/performance-plus-targeting\" target=\"_blank\">\"Pinterest Performance+ targeting\"</a>.
  @BuiltValueField(wireName: r'auto_targeting_enabled')
  bool? get autoTargetingEnabled;

  /// <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the `bid_strategy` type for your ad group is set to `AUTOMATIC_BID`. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>.
  @BuiltValueField(wireName: r'bid_multiplier')
  num? get bidMultiplier;

  @BuiltValueField(wireName: r'budget_type')
  BudgetType? get budgetType;
  // enum budgetTypeEnum {  DAILY,  LIFETIME,  CBO_ADGROUP,  };

  @BuiltValueField(wireName: r'pacing_delivery_type')
  PacingDeliveryType? get pacingDeliveryType;
  // enum pacingDeliveryTypeEnum {  STANDARD,  ACCELERATED,  };

  AdGroupCreateRequestAllOf1._();

  factory AdGroupCreateRequestAllOf1([void updates(AdGroupCreateRequestAllOf1Builder b)]) = _$AdGroupCreateRequestAllOf1;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdGroupCreateRequestAllOf1Builder b) => b
      ..budgetType = BudgetType.DAILY
      ..pacingDeliveryType = PacingDeliveryType.STANDARD;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdGroupCreateRequestAllOf1> get serializer => _$AdGroupCreateRequestAllOf1Serializer();
}

class _$AdGroupCreateRequestAllOf1Serializer implements PrimitiveSerializer<AdGroupCreateRequestAllOf1> {
  @override
  final Iterable<Type> types = const [AdGroupCreateRequestAllOf1, _$AdGroupCreateRequestAllOf1];

  @override
  final String wireName = r'AdGroupCreateRequestAllOf1';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdGroupCreateRequestAllOf1 object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.autoTargetingEnabled != null) {
      yield r'auto_targeting_enabled';
      yield serializers.serialize(
        object.autoTargetingEnabled,
        specifiedType: const FullType(bool),
      );
    }
    if (object.bidMultiplier != null) {
      yield r'bid_multiplier';
      yield serializers.serialize(
        object.bidMultiplier,
        specifiedType: const FullType(num),
      );
    }
    if (object.budgetType != null) {
      yield r'budget_type';
      yield serializers.serialize(
        object.budgetType,
        specifiedType: const FullType(BudgetType),
      );
    }
    if (object.pacingDeliveryType != null) {
      yield r'pacing_delivery_type';
      yield serializers.serialize(
        object.pacingDeliveryType,
        specifiedType: const FullType(PacingDeliveryType),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AdGroupCreateRequestAllOf1 object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdGroupCreateRequestAllOf1Builder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'auto_targeting_enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.autoTargetingEnabled = valueDes;
          break;
        case r'bid_multiplier':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.bidMultiplier = valueDes;
          break;
        case r'budget_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BudgetType),
          ) as BudgetType?;
          if (valueDes == null) continue;
          result.budgetType = valueDes;
          break;
        case r'pacing_delivery_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(PacingDeliveryType),
          ) as PacingDeliveryType?;
          if (valueDes == null) continue;
          result.pacingDeliveryType = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AdGroupCreateRequestAllOf1 deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdGroupCreateRequestAllOf1Builder();
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

