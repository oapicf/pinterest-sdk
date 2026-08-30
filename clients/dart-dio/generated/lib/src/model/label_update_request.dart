//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/label_update_item.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'label_update_request.g.dart';

/// LabelUpdateRequest
///
/// Properties:
/// * [labels] - Labels that you are applying to the campaign.
@BuiltValue()
abstract class LabelUpdateRequest implements Built<LabelUpdateRequest, LabelUpdateRequestBuilder> {
  /// Labels that you are applying to the campaign.
  @BuiltValueField(wireName: r'labels')
  BuiltList<LabelUpdateItem> get labels;

  LabelUpdateRequest._();

  factory LabelUpdateRequest([void updates(LabelUpdateRequestBuilder b)]) = _$LabelUpdateRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LabelUpdateRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LabelUpdateRequest> get serializer => _$LabelUpdateRequestSerializer();
}

class _$LabelUpdateRequestSerializer implements PrimitiveSerializer<LabelUpdateRequest> {
  @override
  final Iterable<Type> types = const [LabelUpdateRequest, _$LabelUpdateRequest];

  @override
  final String wireName = r'LabelUpdateRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LabelUpdateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'labels';
    yield serializers.serialize(
      object.labels,
      specifiedType: const FullType(BuiltList, [FullType(LabelUpdateItem)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    LabelUpdateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LabelUpdateRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'labels':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(LabelUpdateItem)]),
          ) as BuiltList<LabelUpdateItem>;
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
  LabelUpdateRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LabelUpdateRequestBuilder();
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

