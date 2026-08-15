//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/label_status.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'label_update_request_labels_inner.g.dart';

/// LabelUpdateRequestLabelsInner
///
/// Properties:
/// * [id] - Label ID.
/// * [status] 
/// * [value] - Label name. 100-character limit.
@BuiltValue()
abstract class LabelUpdateRequestLabelsInner implements Built<LabelUpdateRequestLabelsInner, LabelUpdateRequestLabelsInnerBuilder> {
  /// Label ID.
  @BuiltValueField(wireName: r'id')
  String get id;

  @BuiltValueField(wireName: r'status')
  LabelStatus? get status;
  // enum statusEnum {  ACTIVE,  ARCHIVED,  ,  };

  /// Label name. 100-character limit.
  @BuiltValueField(wireName: r'value')
  String? get value;

  LabelUpdateRequestLabelsInner._();

  factory LabelUpdateRequestLabelsInner([void updates(LabelUpdateRequestLabelsInnerBuilder b)]) = _$LabelUpdateRequestLabelsInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LabelUpdateRequestLabelsInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LabelUpdateRequestLabelsInner> get serializer => _$LabelUpdateRequestLabelsInnerSerializer();
}

class _$LabelUpdateRequestLabelsInnerSerializer implements PrimitiveSerializer<LabelUpdateRequestLabelsInner> {
  @override
  final Iterable<Type> types = const [LabelUpdateRequestLabelsInner, _$LabelUpdateRequestLabelsInner];

  @override
  final String wireName = r'LabelUpdateRequestLabelsInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LabelUpdateRequestLabelsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    if (object.status != null) {
      yield r'status';
      yield serializers.serialize(
        object.status,
        specifiedType: const FullType.nullable(LabelStatus),
      );
    }
    if (object.value != null) {
      yield r'value';
      yield serializers.serialize(
        object.value,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    LabelUpdateRequestLabelsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LabelUpdateRequestLabelsInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(LabelStatus),
          ) as LabelStatus?;
          if (valueDes == null) continue;
          result.status = valueDes;
          break;
        case r'value':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.value = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  LabelUpdateRequestLabelsInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LabelUpdateRequestLabelsInnerBuilder();
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

