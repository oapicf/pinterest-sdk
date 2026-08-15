//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/keywords_request.dart';
import 'package:openapi/src/model/product_group_promotion_create_request.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/ad_group_create_request.dart';
import 'package:openapi/src/model/label_create_request.dart';
import 'package:openapi/src/model/campaign_create_request.dart';
import 'package:openapi/src/model/ad_create_request.dart';
import 'package:openapi/src/model/multiple_product_groups_inner.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'bulk_upsert_request_create.g.dart';

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
abstract class BulkUpsertRequestCreate implements Built<BulkUpsertRequestCreate, BulkUpsertRequestCreateBuilder> {
  @BuiltValueField(wireName: r'ad_groups')
  BuiltList<AdGroupCreateRequest>? get adGroups;

  @BuiltValueField(wireName: r'ads')
  BuiltList<AdCreateRequest>? get ads;

  @BuiltValueField(wireName: r'campaigns')
  BuiltList<CampaignCreateRequest>? get campaigns;

  @BuiltValueField(wireName: r'catalog_product_groups')
  BuiltList<MultipleProductGroupsInner>? get catalogProductGroups;

  @BuiltValueField(wireName: r'keywords')
  BuiltList<KeywordsRequest>? get keywords;

  @BuiltValueField(wireName: r'labels')
  BuiltList<LabelCreateRequest>? get labels;

  @BuiltValueField(wireName: r'product_groups')
  BuiltList<ProductGroupPromotionCreateRequest>? get productGroups;

  BulkUpsertRequestCreate._();

  factory BulkUpsertRequestCreate([void updates(BulkUpsertRequestCreateBuilder b)]) = _$BulkUpsertRequestCreate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BulkUpsertRequestCreateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BulkUpsertRequestCreate> get serializer => _$BulkUpsertRequestCreateSerializer();
}

class _$BulkUpsertRequestCreateSerializer implements PrimitiveSerializer<BulkUpsertRequestCreate> {
  @override
  final Iterable<Type> types = const [BulkUpsertRequestCreate, _$BulkUpsertRequestCreate];

  @override
  final String wireName = r'BulkUpsertRequestCreate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BulkUpsertRequestCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.adGroups != null) {
      yield r'ad_groups';
      yield serializers.serialize(
        object.adGroups,
        specifiedType: const FullType(BuiltList, [FullType(AdGroupCreateRequest)]),
      );
    }
    if (object.ads != null) {
      yield r'ads';
      yield serializers.serialize(
        object.ads,
        specifiedType: const FullType(BuiltList, [FullType(AdCreateRequest)]),
      );
    }
    if (object.campaigns != null) {
      yield r'campaigns';
      yield serializers.serialize(
        object.campaigns,
        specifiedType: const FullType(BuiltList, [FullType(CampaignCreateRequest)]),
      );
    }
    if (object.catalogProductGroups != null) {
      yield r'catalog_product_groups';
      yield serializers.serialize(
        object.catalogProductGroups,
        specifiedType: const FullType(BuiltList, [FullType(MultipleProductGroupsInner)]),
      );
    }
    if (object.keywords != null) {
      yield r'keywords';
      yield serializers.serialize(
        object.keywords,
        specifiedType: const FullType(BuiltList, [FullType(KeywordsRequest)]),
      );
    }
    if (object.labels != null) {
      yield r'labels';
      yield serializers.serialize(
        object.labels,
        specifiedType: const FullType(BuiltList, [FullType(LabelCreateRequest)]),
      );
    }
    if (object.productGroups != null) {
      yield r'product_groups';
      yield serializers.serialize(
        object.productGroups,
        specifiedType: const FullType(BuiltList, [FullType(ProductGroupPromotionCreateRequest)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    BulkUpsertRequestCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BulkUpsertRequestCreateBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ad_groups':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AdGroupCreateRequest)]),
          ) as BuiltList<AdGroupCreateRequest>;
          result.adGroups.replace(valueDes);
          break;
        case r'ads':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AdCreateRequest)]),
          ) as BuiltList<AdCreateRequest>;
          result.ads.replace(valueDes);
          break;
        case r'campaigns':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(CampaignCreateRequest)]),
          ) as BuiltList<CampaignCreateRequest>;
          result.campaigns.replace(valueDes);
          break;
        case r'catalog_product_groups':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(MultipleProductGroupsInner)]),
          ) as BuiltList<MultipleProductGroupsInner>;
          result.catalogProductGroups.replace(valueDes);
          break;
        case r'keywords':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(KeywordsRequest)]),
          ) as BuiltList<KeywordsRequest>;
          result.keywords.replace(valueDes);
          break;
        case r'labels':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(LabelCreateRequest)]),
          ) as BuiltList<LabelCreateRequest>;
          result.labels.replace(valueDes);
          break;
        case r'product_groups':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ProductGroupPromotionCreateRequest)]),
          ) as BuiltList<ProductGroupPromotionCreateRequest>;
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
  BulkUpsertRequestCreate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BulkUpsertRequestCreateBuilder();
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

