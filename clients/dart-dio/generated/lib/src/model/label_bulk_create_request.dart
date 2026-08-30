//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/label_create_item.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'label_bulk_create_request.g.dart';

/// LabelBulkCreateRequest
///
/// Properties:
/// * [labels] - Labels that you are applying to the campaign.
/// * [parentId] - Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
@BuiltValue()
abstract class LabelBulkCreateRequest implements Built<LabelBulkCreateRequest, LabelBulkCreateRequestBuilder> {
  /// Labels that you are applying to the campaign.
  @BuiltValueField(wireName: r'labels')
  BuiltList<LabelCreateItem> get labels;

  /// Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
  @BuiltValueField(wireName: r'parent_id')
  String get parentId;

  LabelBulkCreateRequest._();

  factory LabelBulkCreateRequest([void updates(LabelBulkCreateRequestBuilder b)]) = _$LabelBulkCreateRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LabelBulkCreateRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LabelBulkCreateRequest> get serializer => _$LabelBulkCreateRequestSerializer();
}

class _$LabelBulkCreateRequestSerializer implements PrimitiveSerializer<LabelBulkCreateRequest> {
  @override
  final Iterable<Type> types = const [LabelBulkCreateRequest, _$LabelBulkCreateRequest];

  @override
  final String wireName = r'LabelBulkCreateRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LabelBulkCreateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'labels';
    yield serializers.serialize(
      object.labels,
      specifiedType: const FullType(BuiltList, [FullType(LabelCreateItem)]),
    );
    yield r'parent_id';
    yield serializers.serialize(
      object.parentId,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    LabelBulkCreateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LabelBulkCreateRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'labels':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(LabelCreateItem)]),
          ) as BuiltList<LabelCreateItem>;
          result.labels.replace(valueDes);
          break;
        case r'parent_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.parentId = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  LabelBulkCreateRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LabelBulkCreateRequestBuilder();
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

