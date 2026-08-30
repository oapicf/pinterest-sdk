//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/targeting_spec_operations.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_group_update_request_all_of1.g.dart';

/// AdGroupUpdateRequestAllOf1
///
/// Properties:
/// * [bidMultiplier] - <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the `bid_strategy` type for your ad group is set to `AUTOMATIC_BID`. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>.
/// * [id] - Ad group ID.
/// * [targetingSpecOperations] - <div>Targeting spec operations define modifications to apply to the targeting spec.</div> <br /> <div><strong>NOTE:</strong> The <code>targeting_spec</code> and <code>targeting_spec_operations</code> cannot be sent at the same time.</div> <br /> <div>The supported operations are:</div> <ul> <li><code>SET</code>: sets the field with the given values. If value is set to <code>null</code>, the field will be removed.</li> <li><code>ADD</code>: adds the given values to the field.</li> <li><code>REMOVE</code>: removes the given values from the field.</li> </ul> <div>Note the following:</div> <ul> <li>Same items are not added and removed at the same time.</li> <li>For a given field, only <code>ADD</code>/<code>REMOVE</code> or <code>SET</code> operations are allowed, not a mix of them.</li> <li>Only one SET operation is allowed for a given field.</li> <li>The <code>AGE_BUCKET</code>, <code>MAXIMUM_AGE</code>, <code>MINIMUM_AGE</code> and <code>SHOPPING_RETARGETING</code> fields only support the <code>SET</code> operation.</li> </ul>
@BuiltValue()
abstract class AdGroupUpdateRequestAllOf1 implements Built<AdGroupUpdateRequestAllOf1, AdGroupUpdateRequestAllOf1Builder> {
  /// <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the `bid_strategy` type for your ad group is set to `AUTOMATIC_BID`. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>.
  @BuiltValueField(wireName: r'bid_multiplier')
  num? get bidMultiplier;

  /// Ad group ID.
  @BuiltValueField(wireName: r'id')
  String get id;

  /// <div>Targeting spec operations define modifications to apply to the targeting spec.</div> <br /> <div><strong>NOTE:</strong> The <code>targeting_spec</code> and <code>targeting_spec_operations</code> cannot be sent at the same time.</div> <br /> <div>The supported operations are:</div> <ul> <li><code>SET</code>: sets the field with the given values. If value is set to <code>null</code>, the field will be removed.</li> <li><code>ADD</code>: adds the given values to the field.</li> <li><code>REMOVE</code>: removes the given values from the field.</li> </ul> <div>Note the following:</div> <ul> <li>Same items are not added and removed at the same time.</li> <li>For a given field, only <code>ADD</code>/<code>REMOVE</code> or <code>SET</code> operations are allowed, not a mix of them.</li> <li>Only one SET operation is allowed for a given field.</li> <li>The <code>AGE_BUCKET</code>, <code>MAXIMUM_AGE</code>, <code>MINIMUM_AGE</code> and <code>SHOPPING_RETARGETING</code> fields only support the <code>SET</code> operation.</li> </ul>
  @BuiltValueField(wireName: r'targeting_spec_operations')
  BuiltList<TargetingSpecOperations>? get targetingSpecOperations;

  AdGroupUpdateRequestAllOf1._();

  factory AdGroupUpdateRequestAllOf1([void updates(AdGroupUpdateRequestAllOf1Builder b)]) = _$AdGroupUpdateRequestAllOf1;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdGroupUpdateRequestAllOf1Builder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdGroupUpdateRequestAllOf1> get serializer => _$AdGroupUpdateRequestAllOf1Serializer();
}

class _$AdGroupUpdateRequestAllOf1Serializer implements PrimitiveSerializer<AdGroupUpdateRequestAllOf1> {
  @override
  final Iterable<Type> types = const [AdGroupUpdateRequestAllOf1, _$AdGroupUpdateRequestAllOf1];

  @override
  final String wireName = r'AdGroupUpdateRequestAllOf1';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdGroupUpdateRequestAllOf1 object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.bidMultiplier != null) {
      yield r'bid_multiplier';
      yield serializers.serialize(
        object.bidMultiplier,
        specifiedType: const FullType(num),
      );
    }
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    if (object.targetingSpecOperations != null) {
      yield r'targeting_spec_operations';
      yield serializers.serialize(
        object.targetingSpecOperations,
        specifiedType: const FullType(BuiltList, [FullType(TargetingSpecOperations)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AdGroupUpdateRequestAllOf1 object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdGroupUpdateRequestAllOf1Builder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'bid_multiplier':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.bidMultiplier = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'targeting_spec_operations':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(TargetingSpecOperations)]),
          ) as BuiltList<TargetingSpecOperations>?;
          if (valueDes == null) continue;
          result.targetingSpecOperations.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AdGroupUpdateRequestAllOf1 deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdGroupUpdateRequestAllOf1Builder();
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

