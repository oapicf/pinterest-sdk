//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/label.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/label_error.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'labels_response.g.dart';

/// LabelsResponse
///
/// Properties:
/// * [errors] - Labels that were not successfully applied.
/// * [labels] 
@BuiltValue()
abstract class LabelsResponse implements Built<LabelsResponse, LabelsResponseBuilder> {
  /// Labels that were not successfully applied.
  @BuiltValueField(wireName: r'errors')
  BuiltList<LabelError>? get errors;

  @BuiltValueField(wireName: r'labels')
  BuiltList<Label>? get labels;

  LabelsResponse._();

  factory LabelsResponse([void updates(LabelsResponseBuilder b)]) = _$LabelsResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LabelsResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LabelsResponse> get serializer => _$LabelsResponseSerializer();
}

class _$LabelsResponseSerializer implements PrimitiveSerializer<LabelsResponse> {
  @override
  final Iterable<Type> types = const [LabelsResponse, _$LabelsResponse];

  @override
  final String wireName = r'LabelsResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LabelsResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.errors != null) {
      yield r'errors';
      yield serializers.serialize(
        object.errors,
        specifiedType: const FullType(BuiltList, [FullType(LabelError)]),
      );
    }
    if (object.labels != null) {
      yield r'labels';
      yield serializers.serialize(
        object.labels,
        specifiedType: const FullType(BuiltList, [FullType(Label)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    LabelsResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LabelsResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'errors':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(LabelError)]),
          ) as BuiltList<LabelError>;
          result.errors.replace(valueDes);
          break;
        case r'labels':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(Label)]),
          ) as BuiltList<Label>;
          result.labels.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  LabelsResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LabelsResponseBuilder();
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

