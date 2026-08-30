//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'system_user_update_with_required_body.g.dart';

/// Resource create or update operation model with required body fields (no OptionalProperties).
///
/// Properties:
/// * [name] - New system user name
@BuiltValue()
abstract class SystemUserUpdateWithRequiredBody implements Built<SystemUserUpdateWithRequiredBody, SystemUserUpdateWithRequiredBodyBuilder> {
  /// New system user name
  @BuiltValueField(wireName: r'name')
  String get name;

  SystemUserUpdateWithRequiredBody._();

  factory SystemUserUpdateWithRequiredBody([void updates(SystemUserUpdateWithRequiredBodyBuilder b)]) = _$SystemUserUpdateWithRequiredBody;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(SystemUserUpdateWithRequiredBodyBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<SystemUserUpdateWithRequiredBody> get serializer => _$SystemUserUpdateWithRequiredBodySerializer();
}

class _$SystemUserUpdateWithRequiredBodySerializer implements PrimitiveSerializer<SystemUserUpdateWithRequiredBody> {
  @override
  final Iterable<Type> types = const [SystemUserUpdateWithRequiredBody, _$SystemUserUpdateWithRequiredBody];

  @override
  final String wireName = r'SystemUserUpdateWithRequiredBody';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    SystemUserUpdateWithRequiredBody object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    SystemUserUpdateWithRequiredBody object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required SystemUserUpdateWithRequiredBodyBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  SystemUserUpdateWithRequiredBody deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = SystemUserUpdateWithRequiredBodyBuilder();
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

