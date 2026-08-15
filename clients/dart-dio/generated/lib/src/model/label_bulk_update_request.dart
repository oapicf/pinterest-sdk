//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'label_bulk_update_request.g.dart';

/// LabelBulkUpdateRequest
///
/// Properties:
/// * [id] - Label ID.
/// * [status] - Set status to `ARCHIVED` to remove the label from the parent entity.
/// * [value] - </p><strong>Note:</strong> value field will be deprecated. Label name. 100-character limit.
@BuiltValue()
abstract class LabelBulkUpdateRequest implements Built<LabelBulkUpdateRequest, LabelBulkUpdateRequestBuilder> {
  /// Label ID.
  @BuiltValueField(wireName: r'id')
  String get id;

  /// Set status to `ARCHIVED` to remove the label from the parent entity.
  @BuiltValueField(wireName: r'status')
  LabelBulkUpdateRequestStatusEnum? get status;
  // enum statusEnum {  ARCHIVED,  };

  /// </p><strong>Note:</strong> value field will be deprecated. Label name. 100-character limit.
  @BuiltValueField(wireName: r'value')
  String? get value;

  LabelBulkUpdateRequest._();

  factory LabelBulkUpdateRequest([void updates(LabelBulkUpdateRequestBuilder b)]) = _$LabelBulkUpdateRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LabelBulkUpdateRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LabelBulkUpdateRequest> get serializer => _$LabelBulkUpdateRequestSerializer();
}

class _$LabelBulkUpdateRequestSerializer implements PrimitiveSerializer<LabelBulkUpdateRequest> {
  @override
  final Iterable<Type> types = const [LabelBulkUpdateRequest, _$LabelBulkUpdateRequest];

  @override
  final String wireName = r'LabelBulkUpdateRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LabelBulkUpdateRequest object, {
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
        specifiedType: const FullType(LabelBulkUpdateRequestStatusEnum),
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
    LabelBulkUpdateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LabelBulkUpdateRequestBuilder result,
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
            specifiedType: const FullType(LabelBulkUpdateRequestStatusEnum),
          ) as LabelBulkUpdateRequestStatusEnum;
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
  LabelBulkUpdateRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LabelBulkUpdateRequestBuilder();
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

class LabelBulkUpdateRequestStatusEnum extends EnumClass {

  /// Set status to `ARCHIVED` to remove the label from the parent entity.
  @BuiltValueEnumConst(wireName: r'ARCHIVED')
  static const LabelBulkUpdateRequestStatusEnum ARCHIVED = _$labelBulkUpdateRequestStatusEnum_ARCHIVED;

  static Serializer<LabelBulkUpdateRequestStatusEnum> get serializer => _$labelBulkUpdateRequestStatusEnumSerializer;

  const LabelBulkUpdateRequestStatusEnum._(String name): super(name);

  static BuiltSet<LabelBulkUpdateRequestStatusEnum> get values => _$labelBulkUpdateRequestStatusEnumValues;
  static LabelBulkUpdateRequestStatusEnum valueOf(String name) => _$labelBulkUpdateRequestStatusEnumValueOf(name);
}

