//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/label_status_bulk_update.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'label_bulk_update_request.g.dart';

/// LabelBulkUpdateRequest
///
/// Properties:
/// * [id] - Label ID.
/// * [parentId] - Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
/// * [status] 
@BuiltValue()
abstract class LabelBulkUpdateRequest implements Built<LabelBulkUpdateRequest, LabelBulkUpdateRequestBuilder> {
  /// Label ID.
  @BuiltValueField(wireName: r'id')
  String get id;

  /// Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
  @BuiltValueField(wireName: r'parent_id')
  String get parentId;

  @BuiltValueField(wireName: r'status')
  LabelStatusBulkUpdate get status;
  // enum statusEnum {  ARCHIVED,  };

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
    yield r'parent_id';
    yield serializers.serialize(
      object.parentId,
      specifiedType: const FullType(String),
    );
    yield r'status';
    yield serializers.serialize(
      object.status,
      specifiedType: const FullType(LabelStatusBulkUpdate),
    );
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
        case r'parent_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.parentId = valueDes;
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(LabelStatusBulkUpdate),
          ) as LabelStatusBulkUpdate;
          result.status = valueDes;
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

