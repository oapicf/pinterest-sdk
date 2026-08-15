//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'exception.g.dart';

/// Exception
///
/// Properties:
/// * [code] - Exception error code.
/// * [message] - Exception message.
@BuiltValue()
abstract class Exception implements Built<Exception, ExceptionBuilder> {
  /// Exception error code.
  @BuiltValueField(wireName: r'code')
  int? get code;

  /// Exception message.
  @BuiltValueField(wireName: r'message')
  String? get message;

  Exception._();

  factory Exception([void updates(ExceptionBuilder b)]) = _$Exception;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ExceptionBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<Exception> get serializer => _$ExceptionSerializer();
}

class _$ExceptionSerializer implements PrimitiveSerializer<Exception> {
  @override
  final Iterable<Type> types = const [Exception, _$Exception];

  @override
  final String wireName = r'Exception';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    Exception object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.code != null) {
      yield r'code';
      yield serializers.serialize(
        object.code,
        specifiedType: const FullType(int),
      );
    }
    if (object.message != null) {
      yield r'message';
      yield serializers.serialize(
        object.message,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    Exception object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ExceptionBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'code':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.code = valueDes;
          break;
        case r'message':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.message = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  Exception deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ExceptionBuilder();
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

