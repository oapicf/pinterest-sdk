//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pinterest_lib_error.g.dart';

/// Default error response
///
/// Properties:
/// * [code] 
/// * [message] 
@BuiltValue()
abstract class PinterestLibError implements Built<PinterestLibError, PinterestLibErrorBuilder> {
  @BuiltValueField(wireName: r'code')
  int get code;

  @BuiltValueField(wireName: r'message')
  String get message;

  PinterestLibError._();

  factory PinterestLibError([void updates(PinterestLibErrorBuilder b)]) = _$PinterestLibError;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PinterestLibErrorBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PinterestLibError> get serializer => _$PinterestLibErrorSerializer();
}

class _$PinterestLibErrorSerializer implements PrimitiveSerializer<PinterestLibError> {
  @override
  final Iterable<Type> types = const [PinterestLibError, _$PinterestLibError];

  @override
  final String wireName = r'PinterestLibError';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PinterestLibError object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'code';
    yield serializers.serialize(
      object.code,
      specifiedType: const FullType(int),
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
    PinterestLibError object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PinterestLibErrorBuilder result,
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
  PinterestLibError deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PinterestLibErrorBuilder();
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

