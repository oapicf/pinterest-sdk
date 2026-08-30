//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/update_mask_bid_option_field.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/country.dart';
import 'package:openapi/src/model/advanced_auction_bid_options.dart';
import 'package:openapi/src/model/language.dart';
import 'package:openapi/src/model/advanced_auction_items_submit_delete_record.dart';
import 'package:openapi/src/model/advanced_auction_items_submit_upsert_record.dart';
import 'package:openapi/src/model/advanced_auction_operation_error.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'advanced_auction_items_submit_record.g.dart';

/// Object describing an item bid option operation
///
/// Properties:
/// * [bidOptions] 
/// * [country] 
/// * [errors] - Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.
/// * [itemId] - The catalog retail item id in the merchant namespace
/// * [language] 
/// * [operation] 
/// * [updateMask] - The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`.
@BuiltValue()
abstract class AdvancedAuctionItemsSubmitRecord implements Built<AdvancedAuctionItemsSubmitRecord, AdvancedAuctionItemsSubmitRecordBuilder> {
  /// One Of [AdvancedAuctionItemsSubmitDeleteRecord], [AdvancedAuctionItemsSubmitUpsertRecord]
  OneOf get oneOf;

  static const String discriminatorFieldName = r'operation';

  static const Map<String, Type> discriminatorMapping = {
    r'DELETE': AdvancedAuctionItemsSubmitDeleteRecord,
    r'UPSERT': AdvancedAuctionItemsSubmitUpsertRecord,
  };

  AdvancedAuctionItemsSubmitRecord._();

  factory AdvancedAuctionItemsSubmitRecord([void updates(AdvancedAuctionItemsSubmitRecordBuilder b)]) = _$AdvancedAuctionItemsSubmitRecord;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdvancedAuctionItemsSubmitRecordBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdvancedAuctionItemsSubmitRecord> get serializer => _$AdvancedAuctionItemsSubmitRecordSerializer();
}

extension AdvancedAuctionItemsSubmitRecordDiscriminatorExt on AdvancedAuctionItemsSubmitRecord {
    String? get discriminatorValue {
        if (this is AdvancedAuctionItemsSubmitDeleteRecord) {
            return r'DELETE';
        }
        if (this is AdvancedAuctionItemsSubmitUpsertRecord) {
            return r'UPSERT';
        }
        return null;
    }
}
extension AdvancedAuctionItemsSubmitRecordBuilderDiscriminatorExt on AdvancedAuctionItemsSubmitRecordBuilder {
    String? get discriminatorValue {
        if (this is AdvancedAuctionItemsSubmitDeleteRecordBuilder) {
            return r'DELETE';
        }
        if (this is AdvancedAuctionItemsSubmitUpsertRecordBuilder) {
            return r'UPSERT';
        }
        return null;
    }
}

class _$AdvancedAuctionItemsSubmitRecordSerializer implements PrimitiveSerializer<AdvancedAuctionItemsSubmitRecord> {
  @override
  final Iterable<Type> types = const [AdvancedAuctionItemsSubmitRecord, _$AdvancedAuctionItemsSubmitRecord];

  @override
  final String wireName = r'AdvancedAuctionItemsSubmitRecord';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdvancedAuctionItemsSubmitRecord object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    AdvancedAuctionItemsSubmitRecord object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  AdvancedAuctionItemsSubmitRecord deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdvancedAuctionItemsSubmitRecordBuilder();
    Object? oneOfDataSrc;
    final serializedList = (serialized as Iterable<Object?>).toList();
    final discIndex = serializedList.indexOf(AdvancedAuctionItemsSubmitRecord.discriminatorFieldName) + 1;
    final discValue = serializers.deserialize(serializedList[discIndex], specifiedType: FullType(String)) as String;
    oneOfDataSrc = serialized;
    final oneOfTypes = [AdvancedAuctionItemsSubmitDeleteRecord, AdvancedAuctionItemsSubmitUpsertRecord, ];
    Object oneOfResult;
    Type oneOfType;
    switch (discValue) {
      case r'DELETE':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(AdvancedAuctionItemsSubmitDeleteRecord),
        ) as AdvancedAuctionItemsSubmitDeleteRecord;
        oneOfType = AdvancedAuctionItemsSubmitDeleteRecord;
        break;
      case r'UPSERT':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(AdvancedAuctionItemsSubmitUpsertRecord),
        ) as AdvancedAuctionItemsSubmitUpsertRecord;
        oneOfType = AdvancedAuctionItemsSubmitUpsertRecord;
        break;
      default:
        throw UnsupportedError("Couldn't deserialize oneOf for the discriminator value: ${discValue}");
    }
    result.oneOf = OneOfDynamic(typeIndex: oneOfTypes.indexOf(oneOfType), types: oneOfTypes, value: oneOfResult);
    return result.build();
  }
}

class AdvancedAuctionItemsSubmitRecordOperationEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'DELETE')
  static const AdvancedAuctionItemsSubmitRecordOperationEnum DELETE = _$advancedAuctionItemsSubmitRecordOperationEnum_DELETE;

  static Serializer<AdvancedAuctionItemsSubmitRecordOperationEnum> get serializer => _$advancedAuctionItemsSubmitRecordOperationEnumSerializer;

  const AdvancedAuctionItemsSubmitRecordOperationEnum._(String name): super(name);

  static BuiltSet<AdvancedAuctionItemsSubmitRecordOperationEnum> get values => _$advancedAuctionItemsSubmitRecordOperationEnumValues;
  static AdvancedAuctionItemsSubmitRecordOperationEnum valueOf(String name) => _$advancedAuctionItemsSubmitRecordOperationEnumValueOf(name);
}

