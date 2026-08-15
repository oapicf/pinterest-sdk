//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/advanced_auction_key.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/country.dart';
import 'package:openapi/src/model/language.dart';
import 'package:openapi/src/model/advanced_auction_operation_error.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'advanced_auction_items_submit_delete_record.g.dart';

/// Object describing an item bid option deletion operation
///
/// Properties:
/// * [country] 
/// * [itemId] - The catalog retail item id in the merchant namespace
/// * [language] 
/// * [errors] - Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.
@BuiltValue()
abstract class AdvancedAuctionItemsSubmitDeleteRecord implements AdvancedAuctionKey, Built<AdvancedAuctionItemsSubmitDeleteRecord, AdvancedAuctionItemsSubmitDeleteRecordBuilder> {
  /// Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.
  @BuiltValueField(wireName: r'errors')
  BuiltList<AdvancedAuctionOperationError>? get errors;

  AdvancedAuctionItemsSubmitDeleteRecord._();

  factory AdvancedAuctionItemsSubmitDeleteRecord([void updates(AdvancedAuctionItemsSubmitDeleteRecordBuilder b)]) = _$AdvancedAuctionItemsSubmitDeleteRecord;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdvancedAuctionItemsSubmitDeleteRecordBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdvancedAuctionItemsSubmitDeleteRecord> get serializer => _$AdvancedAuctionItemsSubmitDeleteRecordSerializer();
}

class _$AdvancedAuctionItemsSubmitDeleteRecordSerializer implements PrimitiveSerializer<AdvancedAuctionItemsSubmitDeleteRecord> {
  @override
  final Iterable<Type> types = const [AdvancedAuctionItemsSubmitDeleteRecord, _$AdvancedAuctionItemsSubmitDeleteRecord];

  @override
  final String wireName = r'AdvancedAuctionItemsSubmitDeleteRecord';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdvancedAuctionItemsSubmitDeleteRecord object, {
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
    yield r'language';
    yield serializers.serialize(
      object.language,
      specifiedType: const FullType(Language),
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
    AdvancedAuctionItemsSubmitDeleteRecord object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdvancedAuctionItemsSubmitDeleteRecordBuilder result,
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
        case r'language':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(Language),
          ) as Language;
          result.language = valueDes;
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
  AdvancedAuctionItemsSubmitDeleteRecord deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdvancedAuctionItemsSubmitDeleteRecordBuilder();
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

