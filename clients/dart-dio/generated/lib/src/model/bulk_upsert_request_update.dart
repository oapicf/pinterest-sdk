//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/ad_group_update_request.dart';
import 'package:openapi/src/model/campaign_update_request.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/label_bulk_update_request.dart';
import 'package:openapi/src/model/catalogs_product_groups_update_request.dart';
import 'package:openapi/src/model/product_group_promotion_update_request.dart';
import 'package:openapi/src/model/keyword_update.dart';
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
@BuiltValue()
abstract class BulkUpsertRequestUpdate implements Built<BulkUpsertRequestUpdate, BulkUpsertRequestUpdateBuilder> {
  @BuiltValueField(wireName: r'ad_groups')
  BuiltList<AdGroupUpdateRequest>? get adGroups;

  @BuiltValueField(wireName: r'ads')
  BuiltList<AdUpdateRequest>? get ads;

  @BuiltValueField(wireName: r'campaigns')
  BuiltList<CampaignUpdateRequest>? get campaigns;

  @BuiltValueField(wireName: r'catalog_product_groups')
  BuiltList<CatalogsProductGroupsUpdateRequest>? get catalogProductGroups;

  @BuiltValueField(wireName: r'keywords')
  BuiltList<KeywordUpdate>? get keywords;

  @BuiltValueField(wireName: r'labels')
  BuiltList<LabelBulkUpdateRequest>? get labels;

  @BuiltValueField(wireName: r'product_groups')
  BuiltList<ProductGroupPromotionUpdateRequest>? get productGroups;

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
        specifiedType: const FullType(BuiltList, [FullType(CatalogsProductGroupsUpdateRequest)]),
      );
    }
    if (object.keywords != null) {
      yield r'keywords';
      yield serializers.serialize(
        object.keywords,
        specifiedType: const FullType(BuiltList, [FullType(KeywordUpdate)]),
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
            specifiedType: const FullType(BuiltList, [FullType(AdGroupUpdateRequest)]),
          ) as BuiltList<AdGroupUpdateRequest>;
          result.adGroups.replace(valueDes);
          break;
        case r'ads':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AdUpdateRequest)]),
          ) as BuiltList<AdUpdateRequest>;
          result.ads.replace(valueDes);
          break;
        case r'campaigns':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(CampaignUpdateRequest)]),
          ) as BuiltList<CampaignUpdateRequest>;
          result.campaigns.replace(valueDes);
          break;
        case r'catalog_product_groups':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(CatalogsProductGroupsUpdateRequest)]),
          ) as BuiltList<CatalogsProductGroupsUpdateRequest>;
          result.catalogProductGroups.replace(valueDes);
          break;
        case r'keywords':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(KeywordUpdate)]),
          ) as BuiltList<KeywordUpdate>;
          result.keywords.replace(valueDes);
          break;
        case r'labels':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(LabelBulkUpdateRequest)]),
          ) as BuiltList<LabelBulkUpdateRequest>;
          result.labels.replace(valueDes);
          break;
        case r'product_groups':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ProductGroupPromotionUpdateRequest)]),
          ) as BuiltList<ProductGroupPromotionUpdateRequest>;
          result.productGroups.replace(valueDes);
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

