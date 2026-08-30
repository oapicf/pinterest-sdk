//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/targeting_spec_gender.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'gender_multipliers.g.dart';

/// This represents a mapping from gender targeting criteria to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified gender in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. All gender multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
///
/// Properties:
/// * [GENDER] - Gender identifier.
@BuiltValue()
abstract class GenderMultipliers implements Built<GenderMultipliers, GenderMultipliersBuilder> {
  /// Gender identifier.
  @BuiltValueField(wireName: r'GENDER')
  TargetingSpecGender? get GENDER;
  // enum GENDEREnum {  unknown,  male,  female,  };

  GenderMultipliers._();

  factory GenderMultipliers([void updates(GenderMultipliersBuilder b)]) = _$GenderMultipliers;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(GenderMultipliersBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<GenderMultipliers> get serializer => _$GenderMultipliersSerializer();
}

class _$GenderMultipliersSerializer implements PrimitiveSerializer<GenderMultipliers> {
  @override
  final Iterable<Type> types = const [GenderMultipliers, _$GenderMultipliers];

  @override
  final String wireName = r'GenderMultipliers';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    GenderMultipliers object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.GENDER != null) {
      yield r'GENDER';
      yield serializers.serialize(
        object.GENDER,
        specifiedType: const FullType(TargetingSpecGender),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    GenderMultipliers object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required GenderMultipliersBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'GENDER':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(TargetingSpecGender),
          ) as TargetingSpecGender?;
          if (valueDes == null) continue;
          result.GENDER = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  GenderMultipliers deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = GenderMultipliersBuilder();
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

