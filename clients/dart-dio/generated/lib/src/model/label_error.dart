//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/label_error_data.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'label_error.g.dart';

/// LabelError
///
/// Properties:
/// * [data] 
/// * [errorMessages] 
@BuiltValue()
abstract class LabelError implements Built<LabelError, LabelErrorBuilder> {
  @BuiltValueField(wireName: r'data')
  LabelErrorData? get data;

  @BuiltValueField(wireName: r'error_messages')
  BuiltList<String>? get errorMessages;

  LabelError._();

  factory LabelError([void updates(LabelErrorBuilder b)]) = _$LabelError;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LabelErrorBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LabelError> get serializer => _$LabelErrorSerializer();
}

class _$LabelErrorSerializer implements PrimitiveSerializer<LabelError> {
  @override
  final Iterable<Type> types = const [LabelError, _$LabelError];

  @override
  final String wireName = r'LabelError';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LabelError object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.data != null) {
      yield r'data';
      yield serializers.serialize(
        object.data,
        specifiedType: const FullType(LabelErrorData),
      );
    }
    if (object.errorMessages != null) {
      yield r'error_messages';
      yield serializers.serialize(
        object.errorMessages,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    LabelError object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LabelErrorBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(LabelErrorData),
          ) as LabelErrorData?;
          if (valueDes == null) continue;
          result.data.replace(valueDes);
          break;
        case r'error_messages':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.errorMessages.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  LabelError deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LabelErrorBuilder();
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

