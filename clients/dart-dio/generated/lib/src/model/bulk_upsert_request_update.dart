//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/ad_group_update_request.dart';
import 'package:openapi/src/model/campaign_update_request.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/label_bulk_update_request.dart';
import 'package:openapi/src/model/keyword_update_generated.dart';
import 'package:openapi/src/model/product_group_promotion_update_request.dart';
import 'package:openapi/src/model/bulk_upsert_request_update_catalog_product_groups_items.dart';
import 'package:openapi/src/model/schedule_update_request.dart';
import 'package:openapi/src/model/ad_update_request.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'bulk_upsert_request_update.g.dart';

/// Request for creation of entities in bulk.
///
/// Properties:
/// * [adGroups] 
/// * [ads] 
/// * [campaigns] 
/// * [catalogProductGroups] 
/// * [keywords] 
/// * [labels] 
/// * [productGroups] 
/// * [schedules] 
@BuiltValue()
abstract class BulkUpsertRequestUpdate implements Built<BulkUpsertRequestUpdate, BulkUpsertRequestUpdateBuilder> {
  @BuiltValueField(wireName: r'ad_groups')
  BuiltList<AdGroupUpdateRequest>? get adGroups;

  @BuiltValueField(wireName: r'ads')
  BuiltList<AdUpdateRequest>? get ads;

  @BuiltValueField(wireName: r'campaigns')
  BuiltList<CampaignUpdateRequest>? get campaigns;

  @BuiltValueField(wireName: r'catalog_product_groups')
  BuiltList<BulkUpsertRequestUpdateCatalogProductGroupsItems>? get catalogProductGroups;

  @BuiltValueField(wireName: r'keywords')
  BuiltList<KeywordUpdateGenerated>? get keywords;

  @BuiltValueField(wireName: r'labels')
  BuiltList<LabelBulkUpdateRequest>? get labels;

  @BuiltValueField(wireName: r'product_groups')
  BuiltList<ProductGroupPromotionUpdateRequest>? get productGroups;

  @BuiltValueField(wireName: r'schedules')
  BuiltList<ScheduleUpdateRequest>? get schedules;

  BulkUpsertRequestUpdate._();

  factory BulkUpsertRequestUpdate([void updates(BulkUpsertRequestUpdateBuilder b)]) = _$BulkUpsertRequestUpdate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BulkUpsertRequestUpdateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BulkUpsertRequestUpdate> get serializer => _$BulkUpsertRequestUpdateSerializer();
}

class _$BulkUpsertRequestUpdateSerializer implements PrimitiveSerializer<BulkUpsertRequestUpdate> {
  @override
  final Iterable<Type> types = const [BulkUpsertRequestUpdate, _$BulkUpsertRequestUpdate];

  @override
  final String wireName = r'BulkUpsertRequestUpdate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BulkUpsertRequestUpdate object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.adGroups != null) {
      yield r'ad_groups';
      yield serializers.serialize(
        object.adGroups,
        specifiedType: const FullType(BuiltList, [FullType(AdGroupUpdateRequest)]),
      );
    }
    if (object.ads != null) {
      yield r'ads';
      yield serializers.serialize(
        object.ads,
        specifiedType: const FullType(BuiltList, [FullType(AdUpdateRequest)]),
      );
    }
    if (object.campaigns != null) {
      yield r'campaigns';
      yield serializers.serialize(
        object.campaigns,
        specifiedType: const FullType(BuiltList, [FullType(CampaignUpdateRequest)]),
      );
    }
    if (object.catalogProductGroups != null) {
      yield r'catalog_product_groups';
      yield serializers.serialize(
        object.catalogProductGroups,
        specifiedType: const FullType(BuiltList, [FullType(BulkUpsertRequestUpdateCatalogProductGroupsItems)]),
      );
    }
    if (object.keywords != null) {
      yield r'keywords';
      yield serializers.serialize(
        object.keywords,
        specifiedType: const FullType(BuiltList, [FullType(KeywordUpdateGenerated)]),
      );
    }
    if (object.labels != null) {
      yield r'labels';
      yield serializers.serialize(
        object.labels,
        specifiedType: const FullType(BuiltList, [FullType(LabelBulkUpdateRequest)]),
      );
    }
    if (object.productGroups != null) {
      yield r'product_groups';
      yield serializers.serialize(
        object.productGroups,
        specifiedType: const FullType(BuiltList, [FullType(ProductGroupPromotionUpdateRequest)]),
      );
    }
    if (object.schedules != null) {
      yield r'schedules';
      yield serializers.serialize(
        object.schedules,
        specifiedType: const FullType(BuiltList, [FullType(ScheduleUpdateRequest)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    BulkUpsertRequestUpdate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BulkUpsertRequestUpdateBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ad_groups':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(AdGroupUpdateRequest)]),
          ) as BuiltList<AdGroupUpdateRequest>?;
          if (valueDes == null) continue;
          result.adGroups.replace(valueDes);
          break;
        case r'ads':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(AdUpdateRequest)]),
          ) as BuiltList<AdUpdateRequest>?;
          if (valueDes == null) continue;
          result.ads.replace(valueDes);
          break;
        case r'campaigns':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(CampaignUpdateRequest)]),
          ) as BuiltList<CampaignUpdateRequest>?;
          if (valueDes == null) continue;
          result.campaigns.replace(valueDes);
          break;
        case r'catalog_product_groups':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(BulkUpsertRequestUpdateCatalogProductGroupsItems)]),
          ) as BuiltList<BulkUpsertRequestUpdateCatalogProductGroupsItems>?;
          if (valueDes == null) continue;
          result.catalogProductGroups.replace(valueDes);
          break;
        case r'keywords':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(KeywordUpdateGenerated)]),
          ) as BuiltList<KeywordUpdateGenerated>?;
          if (valueDes == null) continue;
          result.keywords.replace(valueDes);
          break;
        case r'labels':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(LabelBulkUpdateRequest)]),
          ) as BuiltList<LabelBulkUpdateRequest>?;
          if (valueDes == null) continue;
          result.labels.replace(valueDes);
          break;
        case r'product_groups':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(ProductGroupPromotionUpdateRequest)]),
          ) as BuiltList<ProductGroupPromotionUpdateRequest>?;
          if (valueDes == null) continue;
          result.productGroups.replace(valueDes);
          break;
        case r'schedules':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(ScheduleUpdateRequest)]),
          ) as BuiltList<ScheduleUpdateRequest>?;
          if (valueDes == null) continue;
          result.schedules.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BulkUpsertRequestUpdate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BulkUpsertRequestUpdateBuilder();
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

