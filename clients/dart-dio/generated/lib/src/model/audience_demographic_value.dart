//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audience_demographic_value.g.dart';

/// Demographic detail for a single audience demographic
///
/// Properties:
/// * [key] - Unique key for demographic item
/// * [name] - Display name for demographic
/// * [ratio] - Value of demographic item as a percent of total audience
@BuiltValue()
abstract class AudienceDemographicValue implements Built<AudienceDemographicValue, AudienceDemographicValueBuilder> {
  /// Unique key for demographic item
  @BuiltValueField(wireName: r'key')
  String? get key;

  /// Display name for demographic
  @BuiltValueField(wireName: r'name')
  String? get name;

  /// Value of demographic item as a percent of total audience
  @BuiltValueField(wireName: r'ratio')
  num? get ratio;

  AudienceDemographicValue._();

  factory AudienceDemographicValue([void updates(AudienceDemographicValueBuilder b)]) = _$AudienceDemographicValue;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AudienceDemographicValueBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AudienceDemographicValue> get serializer => _$AudienceDemographicValueSerializer();
}

class _$AudienceDemographicValueSerializer implements PrimitiveSerializer<AudienceDemographicValue> {
  @override
  final Iterable<Type> types = const [AudienceDemographicValue, _$AudienceDemographicValue];

  @override
  final String wireName = r'AudienceDemographicValue';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AudienceDemographicValue object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.key != null) {
      yield r'key';
      yield serializers.serialize(
        object.key,
        specifiedType: const FullType(String),
      );
    }
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(String),
      );
    }
    if (object.ratio != null) {
      yield r'ratio';
      yield serializers.serialize(
        object.ratio,
        specifiedType: const FullType(num),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AudienceDemographicValue object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AudienceDemographicValueBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'key':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.key = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.name = valueDes;
          break;
        case r'ratio':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.ratio = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AudienceDemographicValue deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AudienceDemographicValueBuilder();
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

