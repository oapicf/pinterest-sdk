//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'bid_options_age_bucket_multipliers.g.dart';

/// This represents a mapping from age bucket to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
///
/// Properties:
/// * [n1824] 
/// * [n2534] 
/// * [n3544] 
/// * [n4549] 
/// * [n5054] 
/// * [n5564] 
/// * [n65plus] 
@BuiltValue()
abstract class BidOptionsAgeBucketMultipliers implements Built<BidOptionsAgeBucketMultipliers, BidOptionsAgeBucketMultipliersBuilder> {
  @BuiltValueField(wireName: r'18-24')
  num? get n1824;

  @BuiltValueField(wireName: r'25-34')
  num? get n2534;

  @BuiltValueField(wireName: r'35-44')
  num? get n3544;

  @BuiltValueField(wireName: r'45-49')
  num? get n4549;

  @BuiltValueField(wireName: r'50-54')
  num? get n5054;

  @BuiltValueField(wireName: r'55-64')
  num? get n5564;

  @BuiltValueField(wireName: r'65+')
  num? get n65plus;

  BidOptionsAgeBucketMultipliers._();

  factory BidOptionsAgeBucketMultipliers([void updates(BidOptionsAgeBucketMultipliersBuilder b)]) = _$BidOptionsAgeBucketMultipliers;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BidOptionsAgeBucketMultipliersBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BidOptionsAgeBucketMultipliers> get serializer => _$BidOptionsAgeBucketMultipliersSerializer();
}

class _$BidOptionsAgeBucketMultipliersSerializer implements PrimitiveSerializer<BidOptionsAgeBucketMultipliers> {
  @override
  final Iterable<Type> types = const [BidOptionsAgeBucketMultipliers, _$BidOptionsAgeBucketMultipliers];

  @override
  final String wireName = r'BidOptionsAgeBucketMultipliers';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BidOptionsAgeBucketMultipliers object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.n1824 != null) {
      yield r'18-24';
      yield serializers.serialize(
        object.n1824,
        specifiedType: const FullType(num),
      );
    }
    if (object.n2534 != null) {
      yield r'25-34';
      yield serializers.serialize(
        object.n2534,
        specifiedType: const FullType(num),
      );
    }
    if (object.n3544 != null) {
      yield r'35-44';
      yield serializers.serialize(
        object.n3544,
        specifiedType: const FullType(num),
      );
    }
    if (object.n4549 != null) {
      yield r'45-49';
      yield serializers.serialize(
        object.n4549,
        specifiedType: const FullType(num),
      );
    }
    if (object.n5054 != null) {
      yield r'50-54';
      yield serializers.serialize(
        object.n5054,
        specifiedType: const FullType(num),
      );
    }
    if (object.n5564 != null) {
      yield r'55-64';
      yield serializers.serialize(
        object.n5564,
        specifiedType: const FullType(num),
      );
    }
    if (object.n65plus != null) {
      yield r'65+';
      yield serializers.serialize(
        object.n65plus,
        specifiedType: const FullType(num),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    BidOptionsAgeBucketMultipliers object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BidOptionsAgeBucketMultipliersBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'18-24':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.n1824 = valueDes;
          break;
        case r'25-34':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.n2534 = valueDes;
          break;
        case r'35-44':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.n3544 = valueDes;
          break;
        case r'45-49':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.n4549 = valueDes;
          break;
        case r'50-54':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.n5054 = valueDes;
          break;
        case r'55-64':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.n5564 = valueDes;
          break;
        case r'65+':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.n65plus = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BidOptionsAgeBucketMultipliers deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BidOptionsAgeBucketMultipliersBuilder();
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

