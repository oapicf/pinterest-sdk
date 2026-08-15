//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/label_create_request_labels_inner.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'label_create_request.g.dart';

/// LabelCreateRequest
///
/// Properties:
/// * [labels] - Labels that you are applying to the campaign.
/// * [parentId] - Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
@BuiltValue()
abstract class LabelCreateRequest implements Built<LabelCreateRequest, LabelCreateRequestBuilder> {
  /// Labels that you are applying to the campaign.
  @BuiltValueField(wireName: r'labels')
  BuiltList<LabelCreateRequestLabelsInner> get labels;

  /// Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
  @BuiltValueField(wireName: r'parent_id')
  String get parentId;

  LabelCreateRequest._();

  factory LabelCreateRequest([void updates(LabelCreateRequestBuilder b)]) = _$LabelCreateRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LabelCreateRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LabelCreateRequest> get serializer => _$LabelCreateRequestSerializer();
}

class _$LabelCreateRequestSerializer implements PrimitiveSerializer<LabelCreateRequest> {
  @override
  final Iterable<Type> types = const [LabelCreateRequest, _$LabelCreateRequest];

  @override
  final String wireName = r'LabelCreateRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LabelCreateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'labels';
    yield serializers.serialize(
      object.labels,
      specifiedType: const FullType(BuiltList, [FullType(LabelCreateRequestLabelsInner)]),
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
    LabelCreateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LabelCreateRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'labels':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(LabelCreateRequestLabelsInner)]),
          ) as BuiltList<LabelCreateRequestLabelsInner>;
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
  LabelCreateRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LabelCreateRequestBuilder();
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

