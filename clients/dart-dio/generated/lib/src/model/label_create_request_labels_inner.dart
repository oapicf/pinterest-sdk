//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/label_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'label_create_request_labels_inner.g.dart';

/// LabelCreateRequestLabelsInner
///
/// Properties:
/// * [labelType] 
/// * [value] - Label name. 100-character limit.
@BuiltValue()
abstract class LabelCreateRequestLabelsInner implements Built<LabelCreateRequestLabelsInner, LabelCreateRequestLabelsInnerBuilder> {
  @BuiltValueField(wireName: r'label_type')
  LabelType? get labelType;
  // enum labelTypeEnum {  BRAND,  CUSTOM,  ,  };

  /// Label name. 100-character limit.
  @BuiltValueField(wireName: r'value')
  String get value;

  LabelCreateRequestLabelsInner._();

  factory LabelCreateRequestLabelsInner([void updates(LabelCreateRequestLabelsInnerBuilder b)]) = _$LabelCreateRequestLabelsInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LabelCreateRequestLabelsInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LabelCreateRequestLabelsInner> get serializer => _$LabelCreateRequestLabelsInnerSerializer();
}

class _$LabelCreateRequestLabelsInnerSerializer implements PrimitiveSerializer<LabelCreateRequestLabelsInner> {
  @override
  final Iterable<Type> types = const [LabelCreateRequestLabelsInner, _$LabelCreateRequestLabelsInner];

  @override
  final String wireName = r'LabelCreateRequestLabelsInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LabelCreateRequestLabelsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'label_type';
    yield object.labelType == null ? null : serializers.serialize(
      object.labelType,
      specifiedType: const FullType.nullable(LabelType),
    );
    yield r'value';
    yield serializers.serialize(
      object.value,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    LabelCreateRequestLabelsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LabelCreateRequestLabelsInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'label_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(LabelType),
          ) as LabelType?;
          if (valueDes == null) continue;
          result.labelType = valueDes;
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
  LabelCreateRequestLabelsInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LabelCreateRequestLabelsInnerBuilder();
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

