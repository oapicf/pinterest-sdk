#!/usr/bin/env python3
"""
Post-processing steps run against the OpenAPI spec right after `make
init-spec` fetches it (wired up via the `x-post-init-spec` hook in
Makefile-extras). Each step is a plain function that takes the list of the
spec file's lines and mutates it in place, returning how many lines it
changed. Add a new step by writing a `fix_*` function with that shape and
adding it to STEPS.

Usage: post-init-spec.py <path-to-spec.yml>
Edits the file in place.
"""
import re
import sys

HEADER_RE = re.compile(r"^(?P<indent> *)\S.*: \|(?P<n>[1-9])[+-]?\s*$")


def fix_indentation(lines):
    """
    Normalise indentation of literal block scalars (e.g. `description: |2-`)
    in the fetched Pinterest OpenAPI spec.

    Why this exists:
    Pinterest's published spec contains `description` fields written as YAML
    literal block scalars with an explicit indentation indicator, e.g.:

        description: |2-

           Some paragraph text indented one level.

          - A bullet point indented one level less than the paragraph above.

    PyYAML and Ruby's Psych (libyaml) tolerate the inconsistent indentation,
    but SnakeYAML (used by openapi-generator-cli, which the `generate*`
    Makefile targets shell out to) does not: it locks onto the first content
    line's indentation and then chokes when a later line -- often one
    starting with a markdown `- ` bullet -- sits at a shallower (but still
    valid) indentation, raising:

        expected <block end>, but found '<block sequence start>'

    Only blocks whose content lines are NOT all indented the same amount are
    touched -- those are the ones that actually break SnakeYAML. Each such
    block is snapped to its own minimum observed content indentation (the
    smallest amount of indentation still shared by that block's most-shallow
    line), which is the smallest edit that removes the ambiguity while
    leaving already-consistent blocks -- including ones that happen to sit
    deeper than the indicator's literal `base + N` formula, e.g. for
    embedded code samples -- completely untouched.

    It only looks at literal block scalars that declare an explicit
    indentation indicator (`|<N>` or `|<N>-`/`|<N>+`); it does not touch
    folded (`>`) scalars or block scalars without an explicit indicator,
    since those are not the pattern that trips up SnakeYAML here.
    """
    i = 0
    n = len(lines)
    fixed_count = 0
    while i < n:
        m = HEADER_RE.match(lines[i])
        if not m:
            i += 1
            continue
        base_indent = len(m.group("indent"))
        j = i + 1
        block_line_nums = []
        indents = []
        while j < n:
            line = lines[j]
            if line.strip() == "":
                j += 1
                continue
            cur_indent = len(line) - len(line.lstrip(" "))
            if cur_indent <= base_indent:
                break
            block_line_nums.append(j)
            indents.append(cur_indent)
            j += 1
        if len(set(indents)) > 1:
            target_indent = min(indents)
            for k in block_line_nums:
                cur_indent = len(lines[k]) - len(lines[k].lstrip(" "))
                if cur_indent != target_indent:
                    lines[k] = (" " * target_indent) + lines[k].lstrip(" ")
                    fixed_count += 1
        i = j
    return fixed_count


# Post-init-spec steps to run, in order. Each takes the spec's lines (a
# list of str, one per line, mutated in place) and returns how many lines
# it changed.
STEPS = [
    fix_indentation,
]


def run_steps(path):
    with open(path, "r") as f:
        lines = f.read().split("\n")

    changed = False
    for step in STEPS:
        fixed_count = step(lines)
        if fixed_count:
            changed = True
            print(f"post-init-spec.py: {step.__name__} normalised {fixed_count} line(s) in {path}")
        else:
            print(f"post-init-spec.py: {step.__name__} found nothing to fix in {path}")

    if changed:
        with open(path, "w") as f:
            f.write("\n".join(lines))


def main():
    if len(sys.argv) != 2:
        print("Usage: post-init-spec.py <path-to-spec.yml>", file=sys.stderr)
        sys.exit(1)
    run_steps(sys.argv[1])


if __name__ == "__main__":
    main()
