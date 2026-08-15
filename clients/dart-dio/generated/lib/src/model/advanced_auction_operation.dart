//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'advanced_auction_operation.g.dart';

class AdvancedAuctionOperation extends EnumClass {

  @BuiltValueEnumConst(wireName: r'UPSERT')
  static const AdvancedAuctionOperation UPSERT = _$UPSERT;
  @BuiltValueEnumConst(wireName: r'DELETE')
  static const AdvancedAuctionOperation DELETE = _$DELETE;

  static Serializer<AdvancedAuctionOperation> get serializer => _$advancedAuctionOperationSerializer;

  const AdvancedAuctionOperation._(String name): super(name);

  static BuiltSet<AdvancedAuctionOperation> get values => _$values;
  static AdvancedAuctionOperation valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class AdvancedAuctionOperationMixin = Object with _$AdvancedAuctionOperationMixin;

