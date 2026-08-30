//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pinterest_lib_batch_item_exception.g.dart';

/// Exception details for a batch operation item.
///
/// Properties:
/// * [code] 
/// * [message] 
@BuiltValue()
abstract class PinterestLibBatchItemException implements Built<PinterestLibBatchItemException, PinterestLibBatchItemExceptionBuilder> {
  @BuiltValueField(wireName: r'code')
  int? get code;

  @BuiltValueField(wireName: r'message')
  String get message;

  PinterestLibBatchItemException._();

  factory PinterestLibBatchItemException([void updates(PinterestLibBatchItemExceptionBuilder b)]) = _$PinterestLibBatchItemException;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PinterestLibBatchItemExceptionBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PinterestLibBatchItemException> get serializer => _$PinterestLibBatchItemExceptionSerializer();
}

class _$PinterestLibBatchItemExceptionSerializer implements PrimitiveSerializer<PinterestLibBatchItemException> {
  @override
  final Iterable<Type> types = const [PinterestLibBatchItemException, _$PinterestLibBatchItemException];

  @override
  final String wireName = r'PinterestLibBatchItemException';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PinterestLibBatchItemException object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.code != null) {
      yield r'code';
      yield serializers.serialize(
        object.code,
        specifiedType: const FullType(int),
      );
    }
    yield r'message';
    yield serializers.serialize(
      object.message,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PinterestLibBatchItemException object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PinterestLibBatchItemExceptionBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'code':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
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
  PinterestLibBatchItemException deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PinterestLibBatchItemExceptionBuilder();
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

