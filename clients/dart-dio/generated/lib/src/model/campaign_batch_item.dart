//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/campaign_batch_response_data.dart';
import 'package:openapi/src/model/exception.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'campaign_batch_item.g.dart';

/// Item in a batch campaign response.
///
/// Properties:
/// * [data] - Campaign data on success.
/// * [exceptions] - Exceptions on failure.
@BuiltValue()
abstract class CampaignBatchItem implements Built<CampaignBatchItem, CampaignBatchItemBuilder> {
  /// Campaign data on success.
  @BuiltValueField(wireName: r'data')
  CampaignBatchResponseData? get data;

  /// Exceptions on failure.
  @BuiltValueField(wireName: r'exceptions')
  BuiltList<Exception>? get exceptions;

  CampaignBatchItem._();

  factory CampaignBatchItem([void updates(CampaignBatchItemBuilder b)]) = _$CampaignBatchItem;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CampaignBatchItemBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CampaignBatchItem> get serializer => _$CampaignBatchItemSerializer();
}

class _$CampaignBatchItemSerializer implements PrimitiveSerializer<CampaignBatchItem> {
  @override
  final Iterable<Type> types = const [CampaignBatchItem, _$CampaignBatchItem];

  @override
  final String wireName = r'CampaignBatchItem';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CampaignBatchItem object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.data != null) {
      yield r'data';
      yield serializers.serialize(
        object.data,
        specifiedType: const FullType(CampaignBatchResponseData),
      );
    }
    if (object.exceptions != null) {
      yield r'exceptions';
      yield serializers.serialize(
        object.exceptions,
        specifiedType: const FullType(BuiltList, [FullType(Exception)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CampaignBatchItem object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CampaignBatchItemBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CampaignBatchResponseData),
          ) as CampaignBatchResponseData?;
          if (valueDes == null) continue;
          result.data.replace(valueDes);
          break;
        case r'exceptions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(Exception)]),
          ) as BuiltList<Exception>?;
          if (valueDes == null) continue;
          result.exceptions.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CampaignBatchItem deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CampaignBatchItemBuilder();
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

