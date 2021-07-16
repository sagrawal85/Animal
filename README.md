# Animal
1. Can you implement the sing() method for the bird? -- Done
	1. How did you unit test it? -- Done
	2. How did you optimize the code for maintainability? (Ask yourself the same
question for all following exercises ) -- Created Separate class file

2. Now, we have 2 special kinds of birds: the Duck and the Chicken ... Can you
implement them to make their own special sound?
	1. A duck says: “Quack , quack ”  -- Done
	2. A duck can swim   -- Done
	3. A chicken says: “ Cluck, cluck ”   -- Done
	4. A chicken cannot fly (assumption: its wings are clipped but ignore that )   -- Done

3. Now how would you model a rooster?
	1. A rooster says: “ Cock-a-doodle-doo ”  -- Done
	2. How is the rooster related to the chicken? -- Rooster is Type of Chicken
	3. Can you think of other ways to model a rooster without using inheritance? -- We can think rooster as an animal or a Bird and implement all the related actions according to the rooster itself without implements or extend from chicken.
	
4. Can you model a parrot? We are specifically interested in three parrots, one that lived
in a house with dogs one in a house with cats , the other lived on a farm next to
the rooster.
	1. A parrot living with dogs says: “Woof, woof”  -- Done
	2. A parrot living with cats says: “ Me ow”  -- Done
	3. A parrot living near the rooster says: “ Cock-a-doodle-doo ”  -- Done
	4. How do you keep the parrot maintainable? What if we need another parrot lives
	near a Duck? Or near a phone that rings frequently? -- implemented using parrot class

B. Model fish as well as other swimming animals
1. In addition to the birds, can you model a fish?
	1. Fish es don’t sing -- Done
	2. Fish es don’t walk -- Done
	3. Fish es can swim -- Done
2. Can you specialize the fish as a Shark and as a Clownfish?
	1. Sharks are large and grey -- Done
	2. Clownfish are small and colourful (orange) -- Done
	3. Clownfish make jokes -- Done
	4. Sharks eat other fish -- Done
3. Dolphin s are not exactly f ish, yet, they are good swimmers
	1. Can you model a dolphin that swims without inheriting from a fish class? -- Done
	2. How do you avoid duplicating code or introducing unneeded overhead? -- Using SwinInterface
	