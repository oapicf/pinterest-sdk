//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/bulk_campaign_delivery_estimates_item.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'bulk_campaign_delivery_estimates_response.g.dart';

/// Bulk campaign delivery estimates response.
///
/// Properties:
/// * [data] - Per-campaign delivery estimate results, in the same order as the request.
@BuiltValue()
abstract class BulkCampaignDeliveryEstimatesResponse implements Built<BulkCampaignDeliveryEstimatesResponse, BulkCampaignDeliveryEstimatesResponseBuilder> {
  /// Per-campaign delivery estimate results, in the same order as the request.
  @BuiltValueField(wireName: r'data')
  BuiltList<BulkCampaignDeliveryEstimatesItem> get data;

  BulkCampaignDeliveryEstimatesResponse._();

  factory BulkCampaignDeliveryEstimatesResponse([void updates(BulkCampaignDeliveryEstimatesResponseBuilder b)]) = _$BulkCampaignDeliveryEstimatesResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BulkCampaignDeliveryEstimatesResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BulkCampaignDeliveryEstimatesResponse> get serializer => _$BulkCampaignDeliveryEstimatesResponseSerializer();
}

class _$BulkCampaignDeliveryEstimatesResponseSerializer implements PrimitiveSerializer<BulkCampaignDeliveryEstimatesResponse> {
  @override
  final Iterable<Type> types = const [BulkCampaignDeliveryEstimatesResponse, _$BulkCampaignDeliveryEstimatesResponse];

  @override
  final String wireName = r'BulkCampaignDeliveryEstimatesResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BulkCampaignDeliveryEstimatesResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'data';
    yield serializers.serialize(
      object.data,
      specifiedType: const FullType(BuiltList, [FullType(BulkCampaignDeliveryEstimatesItem)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    BulkCampaignDeliveryEstimatesResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BulkCampaignDeliveryEstimatesResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(BulkCampaignDeliveryEstimatesItem)]),
          ) as BuiltList<BulkCampaignDeliveryEstimatesItem>;
          result.data.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BulkCampaignDeliveryEstimatesResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BulkCampaignDeliveryEstimatesResponseBuilder();
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

