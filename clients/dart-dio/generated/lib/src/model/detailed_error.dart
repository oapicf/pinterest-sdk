//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'detailed_error.g.dart';

/// Used for including extra details to a base error
///
/// Properties:
/// * [code] 
/// * [details] 
/// * [message] 
@BuiltValue()
abstract class DetailedError implements Built<DetailedError, DetailedErrorBuilder> {
  @BuiltValueField(wireName: r'code')
  int get code;

  @BuiltValueField(wireName: r'details')
  JsonObject get details;

  @BuiltValueField(wireName: r'message')
  String get message;

  DetailedError._();

  factory DetailedError([void updates(DetailedErrorBuilder b)]) = _$DetailedError;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(DetailedErrorBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<DetailedError> get serializer => _$DetailedErrorSerializer();
}

class _$DetailedErrorSerializer implements PrimitiveSerializer<DetailedError> {
  @override
  final Iterable<Type> types = const [DetailedError, _$DetailedError];

  @override
  final String wireName = r'DetailedError';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    DetailedError object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'code';
    yield serializers.serialize(
      object.code,
      specifiedType: const FullType(int),
    );
    yield r'details';
    yield serializers.serialize(
      object.details,
      specifiedType: const FullType(JsonObject),
    );
    yield r'message';
    yield serializers.serialize(
      object.message,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    DetailedError object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required DetailedErrorBuilder result,
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
        case r'details':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(JsonObject),
          ) as JsonObject;
          result.details = valueDes;
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
  DetailedError deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = DetailedErrorBuilder();
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

