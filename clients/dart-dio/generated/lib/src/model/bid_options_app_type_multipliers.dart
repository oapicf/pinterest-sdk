//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'bid_options_app_type_multipliers.g.dart';

/// This represents a mapping from app type targeting criteria to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
///
/// Properties:
/// * [androidMobile] 
/// * [androidTablet] 
/// * [ipad] 
/// * [iphone] 
/// * [web] 
/// * [webMobile] 
@BuiltValue()
abstract class BidOptionsAppTypeMultipliers implements Built<BidOptionsAppTypeMultipliers, BidOptionsAppTypeMultipliersBuilder> {
  @BuiltValueField(wireName: r'android_mobile')
  num? get androidMobile;

  @BuiltValueField(wireName: r'android_tablet')
  num? get androidTablet;

  @BuiltValueField(wireName: r'ipad')
  num? get ipad;

  @BuiltValueField(wireName: r'iphone')
  num? get iphone;

  @BuiltValueField(wireName: r'web')
  num? get web;

  @BuiltValueField(wireName: r'web_mobile')
  num? get webMobile;

  BidOptionsAppTypeMultipliers._();

  factory BidOptionsAppTypeMultipliers([void updates(BidOptionsAppTypeMultipliersBuilder b)]) = _$BidOptionsAppTypeMultipliers;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BidOptionsAppTypeMultipliersBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BidOptionsAppTypeMultipliers> get serializer => _$BidOptionsAppTypeMultipliersSerializer();
}

class _$BidOptionsAppTypeMultipliersSerializer implements PrimitiveSerializer<BidOptionsAppTypeMultipliers> {
  @override
  final Iterable<Type> types = const [BidOptionsAppTypeMultipliers, _$BidOptionsAppTypeMultipliers];

  @override
  final String wireName = r'BidOptionsAppTypeMultipliers';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BidOptionsAppTypeMultipliers object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.androidMobile != null) {
      yield r'android_mobile';
      yield serializers.serialize(
        object.androidMobile,
        specifiedType: const FullType(num),
      );
    }
    if (object.androidTablet != null) {
      yield r'android_tablet';
      yield serializers.serialize(
        object.androidTablet,
        specifiedType: const FullType(num),
      );
    }
    if (object.ipad != null) {
      yield r'ipad';
      yield serializers.serialize(
        object.ipad,
        specifiedType: const FullType(num),
      );
    }
    if (object.iphone != null) {
      yield r'iphone';
      yield serializers.serialize(
        object.iphone,
        specifiedType: const FullType(num),
      );
    }
    if (object.web != null) {
      yield r'web';
      yield serializers.serialize(
        object.web,
        specifiedType: const FullType(num),
      );
    }
    if (object.webMobile != null) {
      yield r'web_mobile';
      yield serializers.serialize(
        object.webMobile,
        specifiedType: const FullType(num),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    BidOptionsAppTypeMultipliers object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BidOptionsAppTypeMultipliersBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'android_mobile':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.androidMobile = valueDes;
          break;
        case r'android_tablet':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.androidTablet = valueDes;
          break;
        case r'ipad':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.ipad = valueDes;
          break;
        case r'iphone':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.iphone = valueDes;
          break;
        case r'web':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.web = valueDes;
          break;
        case r'web_mobile':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.webMobile = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BidOptionsAppTypeMultipliers deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BidOptionsAppTypeMultipliersBuilder();
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

