//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/label_create_item.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'label_create_request.g.dart';

/// LabelCreateRequest
///
/// Properties:
/// * [labels] - Labels that you are applying to the campaign.
@BuiltValue()
abstract class LabelCreateRequest implements Built<LabelCreateRequest, LabelCreateRequestBuilder> {
  /// Labels that you are applying to the campaign.
  @BuiltValueField(wireName: r'labels')
  BuiltList<LabelCreateItem> get labels;

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
      specifiedType: const FullType(BuiltList, [FullType(LabelCreateItem)]),
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
            specifiedType: const FullType(BuiltList, [FullType(LabelCreateItem)]),
          ) as BuiltList<LabelCreateItem>;
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

