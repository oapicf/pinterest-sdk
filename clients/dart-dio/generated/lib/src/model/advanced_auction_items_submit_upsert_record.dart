//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/update_mask_bid_option_field.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/country.dart';
import 'package:openapi/src/model/advanced_auction_bid_options.dart';
import 'package:openapi/src/model/language.dart';
import 'package:openapi/src/model/advanced_auction_operation_error.dart';
import 'package:openapi/src/model/advanced_auction_item.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'advanced_auction_items_submit_upsert_record.g.dart';

/// Object describing an item bid option upsert operation
///
/// Properties:
/// * [country] 
/// * [itemId] - The catalog retail item id in the merchant namespace
/// * [language] 
/// * [bidOptions] 
/// * [errors] - Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.
/// * [updateMask] - The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`.
@BuiltValue()
abstract class AdvancedAuctionItemsSubmitUpsertRecord implements AdvancedAuctionItem, Built<AdvancedAuctionItemsSubmitUpsertRecord, AdvancedAuctionItemsSubmitUpsertRecordBuilder> {
  /// The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`.
  @BuiltValueField(wireName: r'update_mask')
  BuiltList<UpdateMaskBidOptionField>? get updateMask;

  /// Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.
  @BuiltValueField(wireName: r'errors')
  BuiltList<AdvancedAuctionOperationError>? get errors;

  AdvancedAuctionItemsSubmitUpsertRecord._();

  factory AdvancedAuctionItemsSubmitUpsertRecord([void updates(AdvancedAuctionItemsSubmitUpsertRecordBuilder b)]) = _$AdvancedAuctionItemsSubmitUpsertRecord;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdvancedAuctionItemsSubmitUpsertRecordBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdvancedAuctionItemsSubmitUpsertRecord> get serializer => _$AdvancedAuctionItemsSubmitUpsertRecordSerializer();
}

class _$AdvancedAuctionItemsSubmitUpsertRecordSerializer implements PrimitiveSerializer<AdvancedAuctionItemsSubmitUpsertRecord> {
  @override
  final Iterable<Type> types = const [AdvancedAuctionItemsSubmitUpsertRecord, _$AdvancedAuctionItemsSubmitUpsertRecord];

  @override
  final String wireName = r'AdvancedAuctionItemsSubmitUpsertRecord';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdvancedAuctionItemsSubmitUpsertRecord object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'country';
    yield serializers.serialize(
      object.country,
      specifiedType: const FullType(Country),
    );
    yield r'item_id';
    yield serializers.serialize(
      object.itemId,
      specifiedType: const FullType(String),
    );
    yield r'bid_options';
    yield serializers.serialize(
      object.bidOptions,
      specifiedType: const FullType(AdvancedAuctionBidOptions),
    );
    yield r'language';
    yield serializers.serialize(
      object.language,
      specifiedType: const FullType(Language),
    );
    yield r'update_mask';
    yield object.updateMask == null ? null : serializers.serialize(
      object.updateMask,
      specifiedType: const FullType.nullable(BuiltList, [FullType(UpdateMaskBidOptionField)]),
    );
    if (object.errors != null) {
      yield r'errors';
      yield serializers.serialize(
        object.errors,
        specifiedType: const FullType(BuiltList, [FullType(AdvancedAuctionOperationError)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AdvancedAuctionItemsSubmitUpsertRecord object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdvancedAuctionItemsSubmitUpsertRecordBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'country':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(Country),
          ) as Country;
          result.country = valueDes;
          break;
        case r'item_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.itemId = valueDes;
          break;
        case r'bid_options':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AdvancedAuctionBidOptions),
          ) as AdvancedAuctionBidOptions;
          result.bidOptions.replace(valueDes);
          break;
        case r'language':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(Language),
          ) as Language;
          result.language = valueDes;
          break;
        case r'update_mask':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(UpdateMaskBidOptionField)]),
          ) as BuiltList<UpdateMaskBidOptionField>?;
          if (valueDes == null) continue;
          result.updateMask.replace(valueDes);
          break;
        case r'errors':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AdvancedAuctionOperationError)]),
          ) as BuiltList<AdvancedAuctionOperationError>;
          result.errors.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AdvancedAuctionItemsSubmitUpsertRecord deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdvancedAuctionItemsSubmitUpsertRecordBuilder();
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

