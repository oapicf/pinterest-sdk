//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ai_disclosure_item.g.dart';

class AiDisclosureItem extends EnumClass {

  /// AI disclosure declaration the creator has made about the Pin.
  @BuiltValueEnumConst(wireName: r'AI_MODIFIED')
  static const AiDisclosureItem AI_MODIFIED = _$AI_MODIFIED;
  /// AI disclosure declaration the creator has made about the Pin.
  @BuiltValueEnumConst(wireName: r'SYNTHETIC_PERFORMER')
  static const AiDisclosureItem SYNTHETIC_PERFORMER = _$SYNTHETIC_PERFORMER;

  static Serializer<AiDisclosureItem> get serializer => _$aiDisclosureItemSerializer;

  const AiDisclosureItem._(String name): super(name);

  static BuiltSet<AiDisclosureItem> get values => _$values;
  static AiDisclosureItem valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class AiDisclosureItemMixin = Object with _$AiDisclosureItemMixin;

