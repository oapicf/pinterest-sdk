//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/audience_demographic_value.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audience_demographics.g.dart';

/// Audience demographics
///
/// Properties:
/// * [ages] - Ages distribution.
/// * [countries] - Country area distribution.
/// * [devices] - Device usage distribution.
/// * [genders] - Gender distribution.
/// * [metros] - Geographic metro area distribution.
@BuiltValue()
abstract class AudienceDemographics implements Built<AudienceDemographics, AudienceDemographicsBuilder> {
  /// Ages distribution.
  @BuiltValueField(wireName: r'ages')
  BuiltList<AudienceDemographicValue>? get ages;

  /// Country area distribution.
  @BuiltValueField(wireName: r'countries')
  BuiltList<AudienceDemographicValue>? get countries;

  /// Device usage distribution.
  @BuiltValueField(wireName: r'devices')
  BuiltList<AudienceDemographicValue>? get devices;

  /// Gender distribution.
  @BuiltValueField(wireName: r'genders')
  BuiltList<AudienceDemographicValue>? get genders;

  /// Geographic metro area distribution.
  @BuiltValueField(wireName: r'metros')
  BuiltList<AudienceDemographicValue>? get metros;

  AudienceDemographics._();

  factory AudienceDemographics([void updates(AudienceDemographicsBuilder b)]) = _$AudienceDemographics;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AudienceDemographicsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AudienceDemographics> get serializer => _$AudienceDemographicsSerializer();
}

class _$AudienceDemographicsSerializer implements PrimitiveSerializer<AudienceDemographics> {
  @override
  final Iterable<Type> types = const [AudienceDemographics, _$AudienceDemographics];

  @override
  final String wireName = r'AudienceDemographics';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AudienceDemographics object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.ages != null) {
      yield r'ages';
      yield serializers.serialize(
        object.ages,
        specifiedType: const FullType(BuiltList, [FullType(AudienceDemographicValue)]),
      );
    }
    if (object.countries != null) {
      yield r'countries';
      yield serializers.serialize(
        object.countries,
        specifiedType: const FullType(BuiltList, [FullType(AudienceDemographicValue)]),
      );
    }
    if (object.devices != null) {
      yield r'devices';
      yield serializers.serialize(
        object.devices,
        specifiedType: const FullType(BuiltList, [FullType(AudienceDemographicValue)]),
      );
    }
    if (object.genders != null) {
      yield r'genders';
      yield serializers.serialize(
        object.genders,
        specifiedType: const FullType(BuiltList, [FullType(AudienceDemographicValue)]),
      );
    }
    if (object.metros != null) {
      yield r'metros';
      yield serializers.serialize(
        object.metros,
        specifiedType: const FullType(BuiltList, [FullType(AudienceDemographicValue)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AudienceDemographics object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AudienceDemographicsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ages':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(AudienceDemographicValue)]),
          ) as BuiltList<AudienceDemographicValue>?;
          if (valueDes == null) continue;
          result.ages.replace(valueDes);
          break;
        case r'countries':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(AudienceDemographicValue)]),
          ) as BuiltList<AudienceDemographicValue>?;
          if (valueDes == null) continue;
          result.countries.replace(valueDes);
          break;
        case r'devices':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(AudienceDemographicValue)]),
          ) as BuiltList<AudienceDemographicValue>?;
          if (valueDes == null) continue;
          result.devices.replace(valueDes);
          break;
        case r'genders':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(AudienceDemographicValue)]),
          ) as BuiltList<AudienceDemographicValue>?;
          if (valueDes == null) continue;
          result.genders.replace(valueDes);
          break;
        case r'metros':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(AudienceDemographicValue)]),
          ) as BuiltList<AudienceDemographicValue>?;
          if (valueDes == null) continue;
          result.metros.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AudienceDemographics deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AudienceDemographicsBuilder();
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

