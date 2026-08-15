//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/label_status.dart';
import 'package:openapi/src/model/label_type.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'label.g.dart';

/// Label
///
/// Properties:
/// * [id] - Label ID.
/// * [labelType] 
/// * [parentId] - Label parent entity ID.
/// * [parentType] - Label parent entity type.
/// * [status] 
/// * [value] - Label name.
@BuiltValue()
abstract class Label implements Built<Label, LabelBuilder> {
  /// Label ID.
  @BuiltValueField(wireName: r'id')
  String? get id;

  @BuiltValueField(wireName: r'label_type')
  LabelType? get labelType;
  // enum labelTypeEnum {  BRAND,  CUSTOM,  ,  };

  /// Label parent entity ID.
  @BuiltValueField(wireName: r'parent_id')
  String? get parentId;

  /// Label parent entity type.
  @BuiltValueField(wireName: r'parent_type')
  LabelParentTypeEnum? get parentType;
  // enum parentTypeEnum {  CAMPAIGN,  ,  };

  @BuiltValueField(wireName: r'status')
  LabelStatus? get status;
  // enum statusEnum {  ACTIVE,  ARCHIVED,  ,  };

  /// Label name.
  @BuiltValueField(wireName: r'value')
  String? get value;

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
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
      );
    }
    if (object.labelType != null) {
      yield r'label_type';
      yield serializers.serialize(
        object.labelType,
        specifiedType: const FullType.nullable(LabelType),
      );
    }
    if (object.parentId != null) {
      yield r'parent_id';
      yield serializers.serialize(
        object.parentId,
        specifiedType: const FullType(String),
      );
    }
    if (object.parentType != null) {
      yield r'parent_type';
      yield serializers.serialize(
        object.parentType,
        specifiedType: const FullType.nullable(LabelParentTypeEnum),
      );
    }
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
            specifiedType: const FullType.nullable(LabelType),
          ) as LabelType?;
          if (valueDes == null) continue;
          result.labelType = valueDes;
          break;
        case r'parent_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.parentId = valueDes;
          break;
        case r'parent_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(LabelParentTypeEnum),
          ) as LabelParentTypeEnum?;
          if (valueDes == null) continue;
          result.parentType = valueDes;
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

class LabelParentTypeEnum extends EnumClass {

  /// Label parent entity type.
  @BuiltValueEnumConst(wireName: r'CAMPAIGN')
  static const LabelParentTypeEnum CAMPAIGN = _$labelParentTypeEnum_CAMPAIGN;

  static Serializer<LabelParentTypeEnum> get serializer => _$labelParentTypeEnumSerializer;

  const LabelParentTypeEnum._(String name): super(name);

  static BuiltSet<LabelParentTypeEnum> get values => _$labelParentTypeEnumValues;
  static LabelParentTypeEnum valueOf(String name) => _$labelParentTypeEnumValueOf(name);
}

