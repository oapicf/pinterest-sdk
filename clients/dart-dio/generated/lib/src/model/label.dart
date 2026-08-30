//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/nullable_label_status.dart';
import 'package:openapi/src/model/nullable_label_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'label.g.dart';

/// Label
///
/// Properties:
/// * [id] - Label ID.
/// * [labelType] 
/// * [status] 
/// * [value] - Label name. 100-character limit.
@BuiltValue()
abstract class Label implements Built<Label, LabelBuilder> {
  /// Label ID.
  @BuiltValueField(wireName: r'id')
  String get id;

  @BuiltValueField(wireName: r'label_type')
  NullableLabelType? get labelType;
  // enum labelTypeEnum {  BRAND,  CUSTOM,  ,  };

  @BuiltValueField(wireName: r'status')
  NullableLabelStatus? get status;
  // enum statusEnum {  ACTIVE,  ARCHIVED,  ,  };

  /// Label name. 100-character limit.
  @BuiltValueField(wireName: r'value')
  String get value;

  Label._();

  factory Label([void updates(LabelBuilder b)]) = _$Label;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LabelBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<Label> get serializer => _$LabelSerializer();
}

class _$LabelSerializer implements PrimitiveSerializer<Label> {
  @override
  final Iterable<Type> types = const [Label, _$Label];

  @override
  final String wireName = r'Label';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    Label object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    yield r'label_type';
    yield object.labelType == null ? null : serializers.serialize(
      object.labelType,
      specifiedType: const FullType.nullable(NullableLabelType),
    );
    if (object.status != null) {
      yield r'status';
      yield serializers.serialize(
        object.status,
        specifiedType: const FullType.nullable(NullableLabelStatus),
      );
    }
    yield r'value';
    yield serializers.serialize(
      object.value,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    Label object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LabelBuilder result,
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
        case r'label_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(NullableLabelType),
          ) as NullableLabelType?;
          if (valueDes == null) continue;
          result.labelType = valueDes;
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(NullableLabelStatus),
          ) as NullableLabelStatus?;
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
  Label deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LabelBuilder();
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

