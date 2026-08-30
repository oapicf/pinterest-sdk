//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/targeting_spec_age_bucket.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'age_bucket_multipliers.g.dart';

/// This represents a mapping from age bucket to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified age bucket in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
///
/// Properties:
/// * [AGE_BUCKET] - Age bucket identifier.
@BuiltValue()
abstract class AgeBucketMultipliers implements Built<AgeBucketMultipliers, AgeBucketMultipliersBuilder> {
  /// Age bucket identifier.
  @BuiltValueField(wireName: r'AGE_BUCKET')
  TargetingSpecAgeBucket? get AGE_BUCKET;
  // enum AGE_BUCKETEnum {  18-24,  19+,  20+,  21+,  25-34,  35-44,  45-49,  50-54,  55-64,  65+,  };

  AgeBucketMultipliers._();

  factory AgeBucketMultipliers([void updates(AgeBucketMultipliersBuilder b)]) = _$AgeBucketMultipliers;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AgeBucketMultipliersBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AgeBucketMultipliers> get serializer => _$AgeBucketMultipliersSerializer();
}

class _$AgeBucketMultipliersSerializer implements PrimitiveSerializer<AgeBucketMultipliers> {
  @override
  final Iterable<Type> types = const [AgeBucketMultipliers, _$AgeBucketMultipliers];

  @override
  final String wireName = r'AgeBucketMultipliers';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AgeBucketMultipliers object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.AGE_BUCKET != null) {
      yield r'AGE_BUCKET';
      yield serializers.serialize(
        object.AGE_BUCKET,
        specifiedType: const FullType(TargetingSpecAgeBucket),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AgeBucketMultipliers object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AgeBucketMultipliersBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'AGE_BUCKET':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(TargetingSpecAgeBucket),
          ) as TargetingSpecAgeBucket?;
          if (valueDes == null) continue;
          result.AGE_BUCKET = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AgeBucketMultipliers deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AgeBucketMultipliersBuilder();
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

